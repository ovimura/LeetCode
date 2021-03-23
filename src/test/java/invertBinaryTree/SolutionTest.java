package invertBinaryTree;

import InvertBinaryTree.*;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void test1() {
        Solution s = new Solution();
        TreeNode root = s.invertTree(new TreeNode(4, new TreeNode(2, new TreeNode(1), new TreeNode(3)),
                new TreeNode(7, new TreeNode(6), new TreeNode(9))));
        s.print(root);
    }

    @Test
    public void test2() {
        Solution s = new Solution();
    }
}
