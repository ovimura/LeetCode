package DiameterOfBinaryTree;

// Reference: https://favtutor.com/blogs/binary-tree-diameter#:~:text=What%20is%20the%20diameter%20of%20a%20binary%20tree%3F,root%20node%20of%20the%20tree.

public class Solution {
    private int c = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        traverse(root);
        return c;
    }

    int traverse(TreeNode root) {
        if(root == null)
            return 0;
        int l = 0, r = 0;
        if(root.left != null) {
            l = traverse(root.left);
        }
        if(root.right != null) {
            r = traverse(root.right);
        }
        if( l + r > c)
            c = l+r;
        return Math.max(l, r) +1;
    }
}

