package findACorrespondingNodeOfABinaryTreeInACloneOfThatTree;

import FindACorrespondingNodeOfABinaryTreeInACloneOfThatTree.*;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        TreeNode r = s.getTargetCopy(
                new TreeNode(7, new TreeNode(4), new TreeNode(3, new TreeNode(6), new TreeNode(19))),
                new TreeNode(7, new TreeNode(4), new TreeNode(3, new TreeNode(6), new TreeNode(19))),
                new TreeNode(3)
        );
        assert (3 == r.val);
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        TreeNode r = s.getTargetCopy(
                new TreeNode(7),
                new TreeNode(7),
                new TreeNode(7)
        );
        assert (7 == r.val);
    }
}
