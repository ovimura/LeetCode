package binaryTreeInorderTraversal;

import BinaryTreeInorderTraversal.*;

import org.junit.Test;

import java.util.List;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        List<Integer> r = s.inorderTraversal(new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null)));
        r.forEach(n -> { System.out.print(n + ", "); });
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        List<Integer> r = s.inorderTraversal(new TreeNode(1, new TreeNode(2, null, null), null));
        r.forEach(n -> { System.out.print(n + ", "); });
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        List<Integer> r = s.inorderTraversal(null);
        r.forEach(n -> { System.out.print(n + ", "); });
    }

    @Test
    public void test4() {
        Solution s = new Solution();
        List<Integer> r = s.inorderTraversal(new TreeNode(1));
        r.forEach(n -> { System.out.print(n + ", "); });
    }

    @Test
    public void test5() {
        Solution s = new Solution();
        List<Integer> r = s.inorderTraversal(new TreeNode(1, null, new TreeNode(2)));
        r.forEach(n -> { System.out.print(n + ", "); });
    }
}
