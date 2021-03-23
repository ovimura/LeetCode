package InvertBinaryTree;

public class Solution {

    public void print(TreeNode root) {
        if(root == null)
            return;
        print(root.left);
        System.out.print(root.val);
        print(root.right);
    }

    public TreeNode invertTree(TreeNode root) {
        if(root == null)
            return root;
        TreeNode l = invertTree(root.left);
        TreeNode r = invertTree(root.right);
        root.left = r;
        root.right = l;
        return root;
    }
}
