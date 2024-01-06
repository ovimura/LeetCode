package constructStringFromBinaryTree;

import ConstructStringFromBinaryTree.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals("1(2(4))(3)",s.tree2str(new TreeNode(1, new TreeNode(2, new TreeNode(4), null), new TreeNode(3))));
    }
}
