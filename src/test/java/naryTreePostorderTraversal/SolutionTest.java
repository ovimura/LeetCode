package naryTreePostorderTraversal;

import NaryTreePostorderTraversal.*;
import org.junit.Test;

import java.util.ArrayList;


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
    }
}
