package CheapestFlightsWithinKStops;


import java.util.*;

// References: https://aaronice.gitbook.io/lintcode/graph_search/cheapest-flights-within-k-stops
public class Solution {

    class Flight {
        int src;
        int dst;
        int price;

        Flight (int src, int dst, int price) {
            this.src = src;
            this.dst = dst;
            this.price = price;
        }
    }

    class Stop {
        int id, cost, count;
        Stop(int id, int cost, int count) {
            this.id = id;
            this.cost = cost;
            this.count = count;
        }
    }


    private static int cheapest;
    private static boolean routeFound;

    public int findCheapestPrice_dfs(int n, int[][] flights, int src, int dst, int K) {
        cheapest = Integer.MAX_VALUE;
        routeFound = false;
        HashMap<Integer, ArrayList<Flight>> map = new HashMap<>();

        for (int[] flight: flights) {
            if (!map.containsKey(flight[0])) {
                map.put(flight[0], new ArrayList<Flight>());
            }
            map.get(flight[0]).add(new Flight(flight[0], flight[1], flight[2]));
        }

        boolean[] visited = new boolean[n];

        dfs(map, visited, src, dst, 0, K);

        if (!routeFound) {
            return -1;
        }
        return cheapest;
    }

    private void dfs(HashMap<Integer, ArrayList<Flight>> map, boolean[] visited, int src, int dst, int cost, int k) {
        if (src == dst) {
            routeFound = true;
            cheapest = Math.min(cheapest, cost);
            return;
        }

        if (k < 0) {
            return;
        }

        ArrayList<Flight> flights = map.get(src);
        if (flights != null) {
            for (Flight flight: flights) {

                // do not visit same city twice
                if (visited[flight.dst]) {
                    continue;
                }
                // Pruning: important to reduce computation
                if (flight.price + cost > cheapest) {
                    continue;
                }
                visited[flight.dst] = true;
                dfs(map, visited, flight.dst, dst, cost + flight.price, k - 1);
                visited[flight.dst] = false;
            }
        }
    }




    public int findCheapestPrice_bsf(int n, int[][] flights, int src, int dst, int K) {
        HashMap<Integer, ArrayList<Flight>> map = new HashMap<>();

        for (int[] flight: flights) {
            if (!map.containsKey(flight[0])) {
                map.put(flight[0], new ArrayList<Flight>());
            }
            map.get(flight[0]).add(new Flight(flight[0], flight[1], flight[2]));
        }


        Comparator<Stop> cmp = new Comparator<Stop>() {
            public int compare(Stop s1, Stop s2) {
                return s1.cost - s2.cost;
            }
        };
        PriorityQueue<Stop> q = new PriorityQueue<Stop>(cmp);

        q.offer(new Stop(src, 0, K));
        while (q != null && !q.isEmpty()) {
            Stop cur = q.poll();
            if (cur.id == dst) {
                return cur.cost;
            }

            if (cur.count >= 0) {
                List<Flight> list = map.get(cur.id);
                if (list == null) {
                    continue;
                }
                for (Flight f: list) {
                    q.offer(new Stop(f.dst, f.price + cur.cost, cur.count - 1));
                }
            }
        }

        return -1;
    }

    // Optimal Solution
    // Reference: https://www.jianshu.com/p/e833f70dc0d3
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        int[][] dp = new int[n][k + 2];
        for (int i = 0; i < n; i++) Arrays.fill(dp[i], Integer.MAX_VALUE);
        for (int i = 0; i <= k + 1; i++) dp[src][i] = 0;
        for (int i = 1; i <= k + 1; i++)
            for (int[] flight : flights)
                if (dp[flight[0]][i - 1] != Integer.MAX_VALUE)
                    dp[flight[1]][i] = Math.min(dp[flight[1]][i], dp[flight[0]][i - 1] + flight[2]);
        return dp[dst][k + 1] == Integer.MAX_VALUE ? -1 : dp[dst][k + 1];
    }
}