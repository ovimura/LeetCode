package SameTree;

public class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null)
            return true;
        if (q == null || p == null)
            return false;
        if(p.val != q.val)
            return false;
        boolean a = isSameTree(p.right, q.right);
        boolean b = isSameTree(p.left, q.left);
        return a && b;
    }
}
