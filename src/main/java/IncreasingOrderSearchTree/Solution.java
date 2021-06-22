package IncreasingOrderSearchTree;

public class Solution {
    TreeNode nr = new TreeNode();
    TreeNode head = nr;
    TreeNode prev = head;
    public TreeNode BST(TreeNode root) {
        if(root == null) {
            return root;
        }
        if(root.left != null)
            BST(root.left);
        nr.val = root.val;
        nr.right = new TreeNode();
        nr.left = null;
        nr = nr.right;
        if(root.right != null)
            BST(root.right);
        return head;
    }

    public TreeNode increasingBST(TreeNode root) {
        TreeNode r = BST(root);
        while(r != null && r.right != null) {
            prev = r;
            r = r.right;
        }
        prev.right = null;
        return head;
    }
}
