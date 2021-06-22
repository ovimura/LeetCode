package naryTreePostorderTraversal;

import NaryTreePostorderTraversal.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class SolutionTest {

    @Test
    public void test1() {
        Solution s = new Solution();
        Node root = new Node(1);
        root.children = new ArrayList<>();
        root.children.add(new Node(3));
        root.children.add(new Node(2));
        root.children.add(new Node(4));
        root.children.get(0).children = new ArrayList<>();
        root.children.get(0).children.add(new Node(5));
        root.children.get(0).children.add(new Node(6));
        s.postorder(root);
        List<Integer> ls = s.postorder(root);
        Integer[] ints = new Integer[ls.size()];
        ints = ls.toArray(ints);
        Assert.assertArrayEquals(new Integer[]{5, 6, 3, 2, 4, 1}, ints);
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Node root = new Node(1);
        root.children = new ArrayList<>();
        root.children.add(new Node(2));
        root.children.add(new Node(3));
        root.children.add(new Node(4));
        root.children.add(new Node(5));
        root.children.get(1).children = new ArrayList<>();
        root.children.get(1).children.add(new Node(6));
        root.children.get(1).children.add(new Node(7));
        root.children.get(1).children.get(1).children = new ArrayList<>();
        root.children.get(1).children.get(1).children.add(new Node(11));
        root.children.get(1).children.get(1).children.get(0).children = new ArrayList<>();
        root.children.get(1).children.get(1).children.get(0).children.add(new Node(14));
        root.children.get(2).children = new ArrayList<>();
        root.children.get(2).children.add(new Node(8));
        root.children.get(2).children.get(0).children = new ArrayList<>();
        root.children.get(2).children.get(0).children.add(new Node(12));
        root.children.get(3).children = new ArrayList<>();
        root.children.get(3).children.add(new Node(9));
        root.children.get(3).children.add(new Node(10));
        root.children.get(3).children.get(0).children = new ArrayList<>();
        root.children.get(3).children.get(0).children.add(new Node(13));

        s.postorder(root);
        List<Integer> ls = s.postorder(root);
        Integer[] ints = new Integer[ls.size()];
        ints = ls.toArray(ints);
        Assert.assertArrayEquals(new Integer[]{2, 6, 14, 11, 7, 3, 12, 8, 4, 13, 9, 10, 5, 1}, ints);
    }

    @Test
    public void test2_iterative() {
        Solution s = new Solution();
        Node root = new Node(1);
        root.children = new ArrayList<>();
        root.children.add(new Node(2));
        root.children.add(new Node(3));
        root.children.add(new Node(4));
        root.children.add(new Node(5));
        root.children.get(1).children = new ArrayList<>();
        root.children.get(1).children.add(new Node(6));
        root.children.get(1).children.add(new Node(7));
        root.children.get(1).children.get(1).children = new ArrayList<>();
        root.children.get(1).children.get(1).children.add(new Node(11));
        root.children.get(1).children.get(1).children.get(0).children = new ArrayList<>();
        root.children.get(1).children.get(1).children.get(0).children.add(new Node(14));
        root.children.get(2).children = new ArrayList<>();
        root.children.get(2).children.add(new Node(8));
        root.children.get(2).children.get(0).children = new ArrayList<>();
        root.children.get(2).children.get(0).children.add(new Node(12));
        root.children.get(3).children = new ArrayList<>();
        root.children.get(3).children.add(new Node(9));
        root.children.get(3).children.add(new Node(10));
        root.children.get(3).children.get(0).children = new ArrayList<>();
        root.children.get(3).children.get(0).children.add(new Node(13));

        //s.postorder(root);
        List<Integer> ls = s.po(root);
        ls.forEach(n -> {
            System.out.print(n);
        });
        Integer[] ints = new Integer[ls.size()];
        ints = ls.toArray(ints);
        Assert.assertArrayEquals(new Integer[]{2, 6, 14, 11, 7, 3, 12, 8, 4, 13, 9, 10, 5, 1}, ints);
    }

    // [8,null,1,null,8,5]
    // Actual: [5,1,8]
    // Expected: [8,5,1,8]
    @Test
    public void test3() {
        Solution s = new Solution();
        Node root = new Node(8);
        root.children = new ArrayList<>();
        root.children.add(new Node(1));
        root.children.get(0).children = new ArrayList<>();
        root.children.get(0).children.add(new Node(8));
        root.children.get(0).children.add(new Node(5));

        List<Integer> ls = s.postorder(root);
        Integer[] ints = new Integer[ls.size()];
        ints = ls.toArray(ints);
        Assert.assertArrayEquals(new Integer[]{8, 5, 1, 8}, ints);
    }

    // [8,null,1,null,8,5]
    // Actual: [5,1,8]
    // Expected: [8,5,1,8]
    @Test
    public void test4() {
        Solution s = new Solution();
        Node root = new Node(8);
        root.children = new ArrayList<>();
        root.children.add(new Node(1));
        root.children.get(0).children = new ArrayList<>();
        root.children.get(0).children.add(new Node(8));
        root.children.get(0).children.add(new Node(5));

        List<Integer> ls = s.postorder00(root);
        Integer[] ints = new Integer[ls.size()];
        ints = ls.toArray(ints);
        Assert.assertArrayEquals(new Integer[]{8, 5, 1, 8}, ints);
    }
}
