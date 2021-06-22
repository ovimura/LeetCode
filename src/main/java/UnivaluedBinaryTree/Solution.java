package UnivaluedBinaryTree;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    List<Boolean> bs = new ArrayList<>();

    public void traverse(TreeNode r, int val) {
        if(r == null)
            return;
        bs.add(r.val == val);
        if(r.left != null)
            traverse(r.left, r.val);
        if (r.right != null)
            traverse(r.right, r.val);
    }

    public boolean isUnivalTree(TreeNode root) {
        traverse(root, root.val);
        for(Boolean b: bs) {
            if (b == false)
                return false;
        }
        return true;
    }
}
