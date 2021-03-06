package bsf;

import Bsf.Graph;
import org.junit.Test;

public class GraphTest {
    @Test
    public void test1() {
        Graph g = new Graph(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1,2);
        g.addEdge(2,0);
        g.addEdge(2,3);
        g.addEdge(3,3);
        System.out.println("Following is Breadth First Traversal (starting from vertex 2)");
        g.BSF(2);
    }
}
