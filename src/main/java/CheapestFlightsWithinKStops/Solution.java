package CheapestFlightsWithinKStops;


import java.util.ArrayList;
import java.util.HashMap;
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

    private static int cheapest;
    private static boolean routeFound;

    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int K) {
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
}