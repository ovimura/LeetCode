package rangeSumOfBST;

import org.junit.Test;
import RangeSumOfBST.Solution;
import RangeSumOfBST.TreeNode;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        TreeNode root = new TreeNode(10, new TreeNode(5, new TreeNode(3), new TreeNode(7)),
                new TreeNode(15, null, new TreeNode(18)));
        s.rangeSumBST(root, 7, 15);
    }
}
