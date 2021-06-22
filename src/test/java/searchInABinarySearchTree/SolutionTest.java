package searchInABinarySearchTree;

import SearchInABinarySearchTree.Solution;
import SearchInABinarySearchTree.TreeNode;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void test1() {
        Solution s = new Solution();
        TreeNode root = new TreeNode(4, new TreeNode(2, new TreeNode(1), new TreeNode(3)),
                new TreeNode(7));
        TreeNode n = s.searchBST(root, 2);
        System.out.println(n.val);
        System.out.println(s.tree.val);

        s.traverse(s.tree);
    }
}
