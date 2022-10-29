package secondMinimumNodeInABinaryTree;

import SecondMinimumNodeInABinaryTree.*;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        assert 5 == s.findSecondMinimumValue(new TreeNode(2, new TreeNode(2),
                new TreeNode(5, new TreeNode(5), new TreeNode(7))));
    }
}
