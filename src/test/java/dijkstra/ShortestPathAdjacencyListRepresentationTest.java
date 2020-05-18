package dijkstra;

import Dijkstra.ShortestPathAdjacencyListRepresentation;
import Dijkstra.Node;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ShortestPathAdjacencyListRepresentationTest {
    @Test
    public void test1() {
        int V = 9;
        int source = 0;
        List<List<Node>> adj = new ArrayList<List<Node>>();
        for(int i=0; i<V; i++) {
            List<Node> item = new ArrayList<Node>();
            adj.add(item);
        }
        adj.get(0).add(new Node(1,4));
        adj.get(0).add(new Node(7,8));

        adj.get(1).add(new Node(2,8));
        adj.get(1).add(new Node(7,11));

        adj.get(2).add(new Node(3,7));
        adj.get(2).add(new Node(8,2));
        adj.get(2).add(new Node(5,4));

        adj.get(3).add(new Node(4,9));
        adj.get(3).add(new Node(5,14));

        adj.get(4).add(new Node(5,10));

        adj.get(5).add(new Node(6,2));

        adj.get(6).add(new Node(7,1));
        adj.get(6).add(new Node(8,6));

        adj.get(7).add(new Node(8,7));

        ShortestPathAdjacencyListRepresentation shortestPathAdjacencyListRepresentation = new ShortestPathAdjacencyListRepresentation(V);
        shortestPathAdjacencyListRepresentation.dijkstra(adj, source);

        System.out.println("The shorted path from node :");
        for(int i=0; i<shortestPathAdjacencyListRepresentation.dist.length; i++) {
            System.out.println(source + " to " + i + " is " + shortestPathAdjacencyListRepresentation.dist[i]);
        }
    }
}
