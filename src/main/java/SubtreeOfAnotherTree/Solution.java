package SubtreeOfAnotherTree;

public class Solution {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null)
            return false;
        if(isIdentical(root, subRoot)) {
            return true;
        }
        return isSubtree(root.right, subRoot) || isSubtree(root.left, subRoot);
    }

    boolean isIdentical(TreeNode s, TreeNode t) {
        if(s == null || t == null)
            return s == null && t == null;
        boolean r = isIdentical(s.right, t.right);
        boolean l = isIdentical(s.left, t.left);
        return s.val == t.val && r && l;
    }
}
