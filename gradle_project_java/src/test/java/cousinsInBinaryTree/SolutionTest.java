package cousinsInBinaryTree;

import CousinsInBinaryTree.*;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertFalse(s.isCousins(new TreeNode(1,
                        new TreeNode(2,
                            new TreeNode(4), null),
                        new TreeNode(3)),
                4, 3));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertFalse(s.isCousins(new TreeNode(1,
                        new TreeNode(2,
                                null, new TreeNode(4)),
                        new TreeNode(3)),
                2, 3));
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        Assert.assertFalse(
                s.isCousins(new TreeNode(1,
                        new TreeNode(2,
                            null, new TreeNode(3, null,
                                                        new TreeNode(4, new TreeNode(5), null))),
                        null),
                        3, 4)
        );
    }

    @Test
    public void test4() {
        Solution s = new Solution();
        Assert.assertTrue(
                s.isCousins(new TreeNode(1,
                                new TreeNode(2, null, new TreeNode(4)),
                                new TreeNode(3, null, new TreeNode(5))),
                        5, 4)
        );
    }

}

