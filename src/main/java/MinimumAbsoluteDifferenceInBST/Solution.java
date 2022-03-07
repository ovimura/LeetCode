package MinimumAbsoluteDifferenceInBST;

public class Solution {
    int min = Integer.MAX_VALUE;
    int prev = Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        traverse(root);
        return min;
    }

    void traverse(TreeNode r) {
        if(r == null)
            return;
        traverse(r.left);

        if(prev != Integer.MAX_VALUE)
            min = Math.min(Math.abs(r.val - prev), min);
        prev = r.val;

        traverse(r.right);
    }
}
