package univaluedBinaryTree;

import UnivaluedBinaryTree.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals(true, s.isUnivalTree(new TreeNode(1, new TreeNode(1, new TreeNode(1), new TreeNode(1)),
                new TreeNode(1, null, new TreeNode(1)))));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertEquals(false, s.isUnivalTree(new TreeNode(1, null, new TreeNode(2))));
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        Assert.assertEquals(false, s.isUnivalTree(new TreeNode(9, new TreeNode(9, new TreeNode(9), new TreeNode(9)),
                new TreeNode(6))));
    }
}
