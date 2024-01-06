package mergeTwoBinaryTrees;

import MergeTwoBinaryTrees.Solution;
import MergeTwoBinaryTrees.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void test() {
        Solution s = new Solution();

        TreeNode t1 = new TreeNode(1);
        t1.right = new TreeNode(2, null, null);
        t1.left = new TreeNode(3, new TreeNode(5, null, null), null);

        TreeNode t2 = new TreeNode(2);
        t2.right = new TreeNode(3, null, new TreeNode(7));
        t2.left = new TreeNode(1, null, new TreeNode(4, null, null));

        TreeNode t3 = new TreeNode(3, new TreeNode(4, new TreeNode(5, null, null), new TreeNode(4, null, null)),
                new TreeNode(5, null, new TreeNode(7, null, null)));

        TreeNode m = s.mergeTrees(t1, t2);

        Assert.assertTrue(s.areEqual(m, t3));
    }
}
