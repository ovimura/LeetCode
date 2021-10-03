package PathSum;

public class Solution {
    boolean found = false;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null)
            return found;
        else if(root.left == null && root.right == null && 0 == targetSum-root.val) {
            found = true;
            return found;
        } else {
            hasPathSum(root.left, targetSum-root.val);
            hasPathSum(root.right, targetSum-root.val);
            return found;
        }

    }
}
