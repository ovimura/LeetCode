package MinimumTimeToCollectAllApplesInATree;

import java.util.*;

public class Solution {
    public int minTime(int n, int[][] edges, List<Boolean> hasApple) {
        Set<Integer> visited = new HashSet<>();
        Map<Integer, Set<Integer>> adjacency = new HashMap<>();
        for (int i = 0; i < n; i++) {
            adjacency.put(i, new HashSet<>());
        }
        int e = edges.length;
        for (int i = 0; i < e; i++) {
            // undirected, 2 directional edges.
            adjacency.get(edges[i][0]).add(edges[i][1]);
            adjacency.get(edges[i][1]).add(edges[i][0]);
        }
        int res = visit(0, visited, adjacency, hasApple);
        if (res == 0) {
            return res;
        }
        return res - 2;
    }

    private int visit(int node, Set<Integer> visited, Map<Integer, Set<Integer>> adjacency, List<Boolean> hasApple) {
        if (visited.contains(node)) {
            return 0;
        }
        visited.add(node);
        int res = 0;
        for (int neighbor : adjacency.get(node)) {
            res += visit(neighbor, visited, adjacency, hasApple);
        }
        if (res != 0 || hasApple.get(node)) {
            res += 2;
        }
        return res;
    }
}
