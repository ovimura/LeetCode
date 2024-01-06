package bsf;

import Bsf.MyBSF;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyBSFTest {
    @Test
    public void test1() {
        MyBSF myBSF = new MyBSF(4);
        List[] adj = new List[4];
        try {
            adj[0] = new ArrayList<Integer>();
            adj[1] = new ArrayList<Integer>();
            adj[2] = new ArrayList<Integer>();
            adj[3] = new ArrayList<Integer>();
            adj[0].add(1);
            adj[0].add(2);
            adj[1].add(2);
            adj[2].add(0);
            adj[2].add(3);
            adj[3].add(3);
            List<Integer> r = myBSF.run(adj, 2);
            Assert.assertArrayEquals(new Integer[]{2,3,0,1},r.toArray());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
