package BinaryTreeTilt;

public class Solution {
    int total = 0;
    public int findTilt(TreeNode root) {
        this.total = 0;
        tilt(root);
        return this.total;
    }

    public int tilt(TreeNode root) {
        if(root == null)
            return 0;
        int l = tilt(root.left);
        int r = tilt(root.right);
        this.total += Math.abs(l - r);
        return root.val + l + r;
    }
}
