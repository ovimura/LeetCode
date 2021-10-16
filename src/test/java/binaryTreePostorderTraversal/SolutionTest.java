package binaryTreePostorderTraversal;

import BinaryTreePostorderTraversal.*;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        List<Integer> r = s.postorderTraversal(new TreeNode(1));
        Assert.assertArrayEquals(new Integer[]{1}, r.toArray(new Integer[]{}));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        List<Integer> r = s.postorderTraversal(null);
        Assert.assertArrayEquals(new Integer[]{}, r.toArray(new Integer[]{}));
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        List<Integer> r = s.postorderTraversal(new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null)));
        Assert.assertArrayEquals(new Integer[]{3,2,1}, r.toArray(new Integer[]{}));
    }

    @Test
    public void test4() {
        Solution s = new Solution();
        List<Integer> r = s.postorderTraversal(new TreeNode(3, new TreeNode(1), new TreeNode(2)));
        Assert.assertArrayEquals(new Integer[]{1,2,3}, r.toArray(new Integer[]{}));
    }
}
