package RangeSumOfBST;

public class Solution {
    public int rangeSumBST(TreeNode root, int L, int R) {
        System.out.println(root.val);
        if(root.left != null)
            rangeSumBST(root.left, 0, 0);
        if(root.right != null)
            rangeSumBST(root.right, 0, 0);
        return 0;
    }
}
