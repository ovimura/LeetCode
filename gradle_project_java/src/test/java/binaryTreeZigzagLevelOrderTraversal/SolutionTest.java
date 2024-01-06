package binaryTreeZigzagLevelOrderTraversal;

import BinaryTreeZigzagLevelOrderTraversal.*;

import org.junit.Test;

import java.util.List;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        List<List<Integer>> l = s.zigzagLevelOrder(new TreeNode(1));
        for(List<Integer> a: l) {
            assert 1 == a.toArray(new Integer[]{})[0];
        }
    }
}
