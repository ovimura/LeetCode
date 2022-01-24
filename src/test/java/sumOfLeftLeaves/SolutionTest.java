package sumOfLeftLeaves;

import SumOfLeftLeaves.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        TreeNode root = new TreeNode(3, new TreeNode(9), new TreeNode(20));
        Assert.assertEquals(9,s.sumOfLeftLeaves(root));
    }
}
