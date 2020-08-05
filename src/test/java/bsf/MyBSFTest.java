package bsf;

import Bsf.MyBSF;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MyBSFTest {
    @Test
    public void test1() {
        MyBSF myBSF = new MyBSF(4);
        List<Integer>[] adj = new ArrayList[4];
        adj[0] = new ArrayList<>();
        adj[1] = new ArrayList<>();
        adj[2] = new ArrayList<>();
        adj[3] = new ArrayList<>();
        adj[0].add(1);
        adj[0].add(2);
        adj[1].add(2);
        adj[2].add(0);
        adj[2].add(3);
        adj[3].add(3);
        myBSF.run(adj, 2);
    }
}
