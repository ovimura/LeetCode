package NumberOfGoodPaths;

import java.util.*;

// References:
// https://walkccc.me/LeetCode/problems/2421/
// https://github.com/javadev/LeetCode-in-Java/blob/main/src/main/java/g2401_2500/s2421_number_of_good_paths/Solution.java

public class Solution {

    class UnionFind {
        public UnionFind(int n) {
            id = new int[n];
            rank = new int[n];
            for (int i = 0; i < n; ++i)
                id[i] = i;
        }

        public void unionByRank(int u, int v) {
            final int i = find(u);
            final int j = find(v);
            if (i == j)
                return;
            if (rank[i] < rank[j]) {
                id[i] = id[j];
            } else if (rank[i] > rank[j]) {
                id[j] = id[i];
            } else {
                id[i] = id[j];
                ++rank[j];
            }
        }

        public int find(int u) {
            return id[u] == u ? u : (id[u] = find(id[u]));
        }

        private int[] id;
        private int[] rank;
    }

    public int numberOfGoodPaths(int[] vals, int[][] edges) {
        final int n = vals.length;
        int ans = n;
        UnionFind uf = new UnionFind(n);
        List<Integer>[] graph = new List[n];
        Map<Integer, List<Integer>> valToNodes = new TreeMap<>();

        for (int i = 0; i < n; ++i)
            graph[i] = new ArrayList<>();

        for (int[] edge : edges) {
            final int u = edge[0];
            final int v = edge[1];
            if (vals[v] <= vals[u])
                graph[u].add(v);
            if (vals[u] <= vals[v])
                graph[v].add(u);
        }

        for (int i = 0; i < vals.length; ++i) {
            valToNodes.putIfAbsent(vals[i], new ArrayList<>());
            valToNodes.get(vals[i]).add(i);
        }

        for (Map.Entry<Integer, List<Integer>> entry : valToNodes.entrySet()) {
            final int val = entry.getKey();
            List<Integer> nodes = entry.getValue();
            for (final int u : nodes)
                for (final int v : graph[u])
                    uf.unionByRank(u, v);
            Map<Integer, Integer> rootCount = new HashMap<>();
            for (final int u : nodes)
                rootCount.merge(uf.find(u), 1, Integer::sum);
            // For each group, C(count, 2) := count * (count - 1) / 2
            for (final int count : rootCount.values())
                ans += count * (count - 1) / 2;
        }

        return ans;
    }



    public int numberOfGoodPaths_second_sol(int[] vals, int[][] edges) {
        int n = vals.length;
        int[] parent = new int[n];
        int[] maxElement = new int[n];
        int[] count = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
            maxElement[i] = vals[i];
            count[i] = 1;
        }
        Arrays.sort(edges, Comparator.comparingInt(a -> Math.max(vals[a[0]], vals[a[1]])));
        int ans = n;
        for (int[] it : edges) {
            int a = findParent(parent, it[0]);
            int b = findParent(parent, it[1]);
            if (maxElement[a] != maxElement[b]) {
                if (maxElement[a] > maxElement[b]) {
                    parent[b] = a;
                } else {
                    parent[a] = b;
                }
            } else {
                parent[b] = a;
                ans += count[a] * count[b];
                count[a] += count[b];
            }
        }
        return ans;
    }

    private int findParent(int[] parent, int a) {
        if (a == parent[a]) {
            return a;
        }
        parent[a] = findParent(parent, parent[a]);
        return parent[a];
    }





// ------------------------------------------------------------------------------------
//    public int numberOfGoodPaths(int[] vals, int[][] edges) {
//        int n = vals.length;
//        int[][] g = new int[n][n];
//        for(int i=0; i<edges.length; i++) {
//            g[edges[i][0]][edges[i][1]] = 1;
//            g[edges[i][1]][edges[i][0]] = 1;
//        }
//        boolean[] visited = new boolean[vals.length];
//        dfs(visited, 0, g);
//        return 0;
//    }
//
//    void dfs(boolean [] visited, int src, int[][] g) {
//        visited[src] = true;
//        for(int i=0; i<g.length; i++) {
//            for(int j=0; j<g[0].length; j++) {
//                System.out.print(g[i][j] + ",");
//            }
//            System.out.println();
//        }
//    }
}
