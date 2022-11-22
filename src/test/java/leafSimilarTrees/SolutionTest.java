package leafSimilarTrees;

import LeafSimilarTrees.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertTrue(s.leafSimilar(new TreeNode(3, new TreeNode(5, new TreeNode(6), new TreeNode(2, new TreeNode(7), new TreeNode(4))),
                        new TreeNode(1, new TreeNode(9), new TreeNode(8))),
                new TreeNode(3, new TreeNode(5, new TreeNode(6), new TreeNode(7)),
                        new TreeNode(1, new TreeNode(4), new TreeNode(2, new TreeNode(9), new TreeNode(8))))));
    }
}
