package pathSum;

import PathSum.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void tes1() {
        Solution s = new Solution();
        Assert.assertEquals(true,
                s.hasPathSum(new TreeNode(5,
                                new TreeNode(4,
                                        new TreeNode(11,
                                                new TreeNode(7),
                                                new TreeNode(2)),
                                        null),
                                new TreeNode(8,
                                        new TreeNode(13),
                                        new TreeNode(4,
                                                null,
                                                new TreeNode(1)))
                        ),
                22));
    }

    @Test
    public void tes2() {
        Solution s = new Solution();
        Assert.assertEquals(true,
                s.hasPathSum(new TreeNode(1,
                                new TreeNode(2),
                                new TreeNode(3)),
                        3));
    }
}
