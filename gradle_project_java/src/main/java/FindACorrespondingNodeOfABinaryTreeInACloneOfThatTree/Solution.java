package FindACorrespondingNodeOfABinaryTreeInACloneOfThatTree;

public class Solution {
    TreeNode t = null;
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        traverse(original, cloned, target);
        return t;
    }

    void traverse(TreeNode o, TreeNode c, TreeNode t) {
        if(o == null)
            return;
        if(o.val == t.val) {
            this.t = c;
            return;
        }
        if(o.left != null){
            traverse(o.left, c.left, t);
        }
        if(o.right != null) {
            traverse(o.right, c.right, t);
        }
    }
}
