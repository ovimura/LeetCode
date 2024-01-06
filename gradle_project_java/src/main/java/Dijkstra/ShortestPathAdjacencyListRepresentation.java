package Dijkstra;

import java.util.*;

// Java implementation of Dijkstra's Algorithm using Priority Queue
public class ShortestPathAdjacencyListRepresentation {
    public int dist[];
    private Set<Integer> settled;
    private PriorityQueue<Node> pq;
    private int V;
    List<List<Node>> adj;

    public ShortestPathAdjacencyListRepresentation(int v) {
        this.V = v;
        dist = new int[V];
        settled = new HashSet<Integer>();
        pq = new PriorityQueue<Node>(V, new Node());
    }

    public void dijkstra(List<List<Node>> adj, int src) {
        this.adj = adj;
        for(int i=0; i<V; i++)
            dist[i] = Integer.MAX_VALUE;
        pq.add(new Node(src, 0));
        dist[src] = 0;
        while (settled.size() != V) {
            int u = pq.remove().node;
            settled.add(u);
            e_Neighbours(u);
        }
    }

    private void e_Neighbours(int u) {
        // Process all the neighbours of the passed node
        int edgeDistance = -1;
        int newDistance = -1;
        for(int i=0; i<adj.get(u).size(); i++) {
            Node v = adj.get(u).get(i);
            if(!settled.contains(v.node)) {
                edgeDistance = v.cost;
                newDistance = dist[u] + edgeDistance;
                if(newDistance < dist[v.node])
                    dist[v.node] = newDistance;
                pq.add(new Node(v.node, dist[v.node]));
            }
        }
    }
}
