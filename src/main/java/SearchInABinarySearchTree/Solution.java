package SearchInABinarySearchTree;

public class Solution {

    public TreeNode tree = null;

    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null)
            return root;
        searchBST(root.left, val);
        searchBST(root.right, val);
        if(root.val == val) {
            tree = root;
        }
        return tree;
    }

    public TreeNode traverse(TreeNode n) {
        if(n == null)
            return n;
        traverse(n.left);
        System.out.print(n.val);
        traverse(n.right);
        return n;
    }
}
