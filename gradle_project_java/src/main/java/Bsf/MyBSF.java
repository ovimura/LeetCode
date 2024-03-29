package Bsf;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class MyBSF {
    private boolean[] visited;
    private Stack<Integer> q;
    private List<Integer> result;

    public MyBSF(int len) {
        visited = new boolean[len];
        q = new Stack<Integer>();
        result = new ArrayList<>();
    }

    public List<Integer> run(List<Integer> adj[], int v) {
        for(int i=0; i<this.visited.length; i++) {
            visited[i] = false;
        }
        q.push(v);
        visited[v] = true;
        while (!q.isEmpty()) {
            int u = q.pop();
            //System.out.print(u + " ");
            result.add(u);
            List<Integer> vs = adj[u];
            while(vs.size() > 0) {
                int t = vs.get(0);
                vs.remove(0);
                if(!visited[t]) {
                    visited[t] = true;
                    q.push(t);
                }
            }
        }
        return result;
    }
}
