package ConstructStringFromBinaryTree;

public class Solution {
    StringBuilder s = new StringBuilder();

    public String tree2str(TreeNode root) {
        traverse(root);
        return s.toString();
    }

    void traverse(TreeNode root) {
        if(root == null)
            return;
        s.append(root.val);
        if(root.left == null && root.right == null)
            return;
        s.append("(");
        traverse(root.left);
        s.append(")");
        if(root.right != null) {
            s.append("(");
            traverse(root.right);
            s.append(")");
        }
    }
}
