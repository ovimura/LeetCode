package RedundantConnection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    Set<Integer> seen = new HashSet();
    int MAX_EDGE_VAL = 1000;

    public int[] findRedundantConnection(int[][] edges) {
        ArrayList<Integer>[] graph = new ArrayList[MAX_EDGE_VAL + 1];
        for (int i = 0; i <= MAX_EDGE_VAL; i++) {
            graph[i] = new ArrayList();
        }

        for (int[] edge: edges) {
            seen.clear();
            if (!graph[edge[0]].isEmpty() && !graph[edge[1]].isEmpty() &&
                    dfs(graph, edge[0], edge[1])) {
                return edge;
            }
            graph[edge[0]].add(edge[1]);
            graph[edge[1]].add(edge[0]);
        }
        throw new AssertionError();
    }
    public boolean dfs(ArrayList<Integer>[] graph, int source, int target) {
        if (!seen.contains(source)) {
            seen.add(source);
            if (source == target) return true;
            for (int nei: graph[source]) {
                if (dfs(graph, nei, target)) return true;
            }
        }
        return false;
    }

    // Solution 2

    ArrayList<Integer>[] graph = new ArrayList[1001];
    void initGraph() {
        for(int i=0; i<graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
    }
    public int[] findRedundantConnection_1(int[][] edges) {
        initGraph();
        int[] rs = new int[2];
        boolean[] seen = new boolean[1001];
        for(int[] e: edges) {
            for(int i=0; i< seen.length; i++)
                seen[i] = false;
            if(!graph[e[0]].isEmpty() && !graph[e[1]].isEmpty() && dfs(seen, e[0], e[1]))
                return e;
            graph[e[0]].add(e[1]);
            graph[e[1]].add(e[0]);
        }
        return rs;
    }

    public boolean dfs(boolean[] seen, int start, int target) {
        if(start == target)
            return true;
        if(seen[start])
            return false;
        seen[start] = true;
        for (int n: graph[start]) {
            if(dfs(seen, n, target)) return true;
        }
        return false;
    }











































}
