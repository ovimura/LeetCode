package subtreeOfAnotherTree;

import SubtreeOfAnotherTree.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertTrue(s.isSubtree(new TreeNode(3, new TreeNode(4, new TreeNode(1), new TreeNode(2)), new TreeNode(5)),
                new TreeNode(4, new TreeNode(1), new TreeNode(2))));
    }
}
