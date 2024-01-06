package binaryTreePaths;

import BinaryTreePaths.*;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.right = new TreeNode(5);
        root.right = new TreeNode(3);
        List<String> ss = s.binaryTreePaths(root);
        Assert.assertArrayEquals(new String[]{"1->2->5","1->3"}, ss.toArray());
    }
}
