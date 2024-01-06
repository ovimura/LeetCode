package MaximumDepthOfBinaryTree;

import SameTree.TreeNode;

public class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null)
            return 0;
        int ld = maxDepth(root.left);
        int rd = maxDepth(root.right);
        if(ld > rd)
            return ld+1;
        else
            return rd+1;
    }
}
