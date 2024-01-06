package minimumDistanceBetweenBSTNodes;

import MinimumDistanceBetweenBSTNodes.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals(1, s.minDiffInBST(new TreeNode(4, new TreeNode(2, new TreeNode(1), new TreeNode(3)), new TreeNode(6))));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertEquals(1, s.minDiffInBST(new TreeNode(1, new TreeNode(0), new TreeNode(48,
                new TreeNode(12), new TreeNode(49)))));
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        Assert.assertEquals(9, s.minDiffInBST(new TreeNode(236, new TreeNode(104, null, new TreeNode(227)),
                new TreeNode(701,
                        null, new TreeNode(911)))));
    }
}
