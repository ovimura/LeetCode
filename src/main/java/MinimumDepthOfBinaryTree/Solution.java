package MinimumDepthOfBinaryTree;

import SameTree.TreeNode;

public class Solution {
    public int minDepth(TreeNode root) {
        if(root == null)
            return 0;
        int ld = minDepth(root.left);
        int rd = minDepth(root.right);
        if(ld > rd)
            return rd+1;
        else
            return ld+1;
    }
}
