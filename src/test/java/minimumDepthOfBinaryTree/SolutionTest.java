package minimumDepthOfBinaryTree;

import MinimumDepthOfBinaryTree.Solution;
import SameTree.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        Assert.assertEquals(2, s.minDepth(root));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        Assert.assertEquals(2, s.minDepth(root));
    }
}
