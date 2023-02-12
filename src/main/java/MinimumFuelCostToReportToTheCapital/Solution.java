package MinimumFuelCostToReportToTheCapital;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    long ans = 0;

    public long minimumFuelCost(int[][] roads, int seats) {
        List<List<Integer>> graph = new ArrayList<>();
        int n = roads.length+1;
        for(int i=0; i<n; i++) graph.add(new ArrayList<>());
        for(int[] road:roads){
            graph.get(road[0]).add(road[1]);
            graph.get(road[1]).add(road[0]);
        }
        dfs(0, 0, seats, graph);
        return ans;
    }

    public int dfs(int cur, int prev, int seats, List<List<Integer>> graph){
        int people = 1;
        for(int next:graph.get(cur)){
            if(next==prev) continue;
            people += dfs(next, cur, seats, graph);
        }
        if(cur!=0) ans += (people+seats-1)/seats;
        return people;
    }
}
