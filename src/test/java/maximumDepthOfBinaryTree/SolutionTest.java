package maximumDepthOfBinaryTree;

import MaximumDepthOfBinaryTree.Solution;
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
        root.right.right = new TreeNode(7);
        root.right.left = new TreeNode(15);
        Assert.assertEquals(3, s.maxDepth(root));
    }
}
