package sumOfRootToLeafBinaryNumbers;

import SumOfRootToLeafBinaryNumbers.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void test1() {
        Solution s = new Solution();
        TreeNode root = new TreeNode(1, new TreeNode(0, new TreeNode(0), new TreeNode(1)),
                new TreeNode(1, new TreeNode(0), new TreeNode(1)));
        Assert.assertEquals(22, s.sumRootToLeaf(root));
    }
}
