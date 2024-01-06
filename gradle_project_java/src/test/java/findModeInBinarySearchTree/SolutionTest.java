package findModeInBinarySearchTree;

import FindModeInBinarySearchTree.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new int[]{2}, s.findMode(new TreeNode(1, null, new TreeNode(2, new TreeNode(2),null))));
    }
}
