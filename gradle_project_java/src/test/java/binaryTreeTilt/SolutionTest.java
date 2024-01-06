package binaryTreeTilt;

import BinaryTreeTilt.*;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        assert 1 == s.findTilt(new TreeNode(1, new TreeNode(2), new TreeNode(3)));
    }
}
