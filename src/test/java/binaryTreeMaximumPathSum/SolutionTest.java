package binaryTreeMaximumPathSum;

import SameTree.TreeNode;
import BinaryTreeMaximumPathSum.Solution;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        Assert.assertEquals(6, s.maxPathSum(root));
    }
}
