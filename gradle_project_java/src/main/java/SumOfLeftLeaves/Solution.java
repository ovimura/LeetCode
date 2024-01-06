package SumOfLeftLeaves;

public class Solution {
    int sum = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        traverse(root);
        return sum;
    }

    void traverse(TreeNode r) {
        if(r == null)
            return;
        if(r.left != null) {
            if(r.left.left == null && r.left.right == null)
                sum += r.left.val;
            traverse(r.left);
        }
        if(r.right != null) {
            traverse(r.right);
        }
    }
}
