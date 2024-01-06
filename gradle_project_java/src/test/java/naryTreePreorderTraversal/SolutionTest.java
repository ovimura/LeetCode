package naryTreePreorderTraversal;

import NaryTreePreorderTraversal.*;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Node root = new Node(1);
        List<Node> chlds = new ArrayList<>();
        chlds.add(new Node(5));
        chlds.add(new Node(6));
        root.children = new ArrayList<>();
        root.children.add(new Node(3, chlds));
        root.children.add(new Node(2));
        root.children.add(new Node(4));
        Assert.assertArrayEquals(new Integer[]{1,3,5,6,2,4}, s.preorder(root).toArray());
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Node root = new Node(1);
        root.children = new ArrayList<>();
        root.children.add(new Node(2));
        List<Node> chlds = new ArrayList<>();
        chlds.add(new Node(6));
        List<Node> ns1 = new ArrayList<>();
        ns1.add(new Node(14));
        List<Node> ns2 = new ArrayList<>();
        ns2.add(new Node(11, ns1));
        chlds.add(new Node(7, ns2));
        root.children.add(new Node(3, chlds));
        List<Node> c4 = new ArrayList<>();
        List<Node> cc4 = new ArrayList<>();
        cc4.add(new Node(12));
        c4.add(new Node(8, cc4));
        root.children.add(new Node(4, c4));
        List<Node> c5 = new ArrayList<>();
        List<Node> cc5 = new ArrayList<>();
        cc5.add(new Node(13));
        c5.add(new Node(9, cc5));
        c5.add(new Node(10));
        root.children.add(new Node(5, c5));
        Assert.assertArrayEquals(new Integer[]{1,2,3,6,7,11,14,4,8,12,5,9,13,10}, s.preorder(root).toArray());
    }
}
