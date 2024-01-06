package diameterOfBinaryTree;

import DiameterOfBinaryTree.*;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(4), new TreeNode(5)), new TreeNode(3));

        assert 3 == s.diameterOfBinaryTree(root);
    }
}
