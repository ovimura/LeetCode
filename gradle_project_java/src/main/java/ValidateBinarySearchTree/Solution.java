package ValidateBinarySearchTree;

public class Solution {
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);
    }

    public boolean isValidBST(TreeNode n, double min, double max) {
        if(n==null)
            return true;
        if(n.val <= min || n.val >= max)
            return false;
        return isValidBST(n.left, min, n.val) && isValidBST(n.right, n.val, max);
    }
}
