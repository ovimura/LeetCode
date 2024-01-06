package BalancedBinaryTree;

public class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root == null)
            return true;
        else {
            int h1 = height(root.left);
            int h2 = height(root.right);
            if(Math.abs(h1-h2) > 1)
                return false;
            else {
                if(isBalanced(root.left) &&  isBalanced(root.right))
                    return true;
                else return false;
            }
        }
    }

    int height(TreeNode n) {
        if(n == null)
            return 0;
        else {
            int l = height(n.left);
            int r = height(n.right);
            if(l<r)
                return r+1;
            else
                return l+1;
        }
    }
}
