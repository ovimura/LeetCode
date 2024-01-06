package MergeTwoBinaryTrees;

public class Solution {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1 == null)
            return t2;
        if(t2 == null)
            return t1;
        t1.val += t2.val;
        t1.left = mergeTrees(t1.left, t2.left);
        t1.right = mergeTrees(t1.right, t2.right);
        return t1;
    }

    public boolean areEqual(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null)
            return true;
        else if (t1 == null || t2 == null)
            return false;
        else {
            if(t1.val == t2.val && areEqual(t1.left, t2.left) && areEqual(t1.right, t2.right))
                return true;
            return false;
        }
    }
}
