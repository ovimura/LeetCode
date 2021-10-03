package balancedBinaryTree;

import BalancedBinaryTree.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals(true, s.isBalanced(new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)))));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertEquals(true, s.isBalanced(null));
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        Assert.assertEquals(false, s.isBalanced(new TreeNode(1, new TreeNode(2, new TreeNode(3, new TreeNode(4), new TreeNode(4)), new TreeNode(3)),
                new TreeNode(2))));
    }

    @Test
    public void test4() {
        Solution s = new Solution();
        Assert.assertEquals(false, s.isBalanced(new TreeNode(1, new TreeNode(2, new TreeNode(3, new TreeNode(4), null), null),
                new TreeNode(2, null, new TreeNode(3, null, new TreeNode(4))))));
    }
}
