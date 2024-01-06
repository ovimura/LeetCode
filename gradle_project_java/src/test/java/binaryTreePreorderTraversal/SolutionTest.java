package binaryTreePreorderTraversal;

import BinaryTreePreorderTraversal.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new Integer[]{1},
                s.preorderTraversal(new TreeNode(1)).toArray(new Integer[]{}));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new Integer[]{1,2,3},
                s.preorderTraversal(new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null))).toArray(new Integer[]{}));
    }
}
