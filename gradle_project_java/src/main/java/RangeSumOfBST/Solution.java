package RangeSumOfBST;

public class Solution {
    int range = 0;
    public int rangeSumBST(TreeNode root, int L, int R) {
        if(root.val >= L && root.val <= R)
            range += root.val;
        if(root.left != null)
            rangeSumBST(root.left, L, R);
        if(root.right != null)
            rangeSumBST(root.right, L, R);
        return range;
    }
}
