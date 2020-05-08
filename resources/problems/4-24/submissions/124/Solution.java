/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    class Result {
        public int val = Integer.MIN_VALUE;
    }
    private int maxPathSum(TreeNode root, Result max) {
        if (root == null)
            return 0;

        int left = maxPathSum(root.left, max);
        int right = maxPathSum(root.right, max);

        int current = Math.max(root.val, Math.max(root.val + left, root.val + right));

        max.val = Math.max(max.val, Math.max(current, left + root.val + right));

        return current;
    }

    public int maxPathSum(TreeNode root) {
        Result max = new Result();
        maxPathSum(root, max);
        return max.val;
    }
}