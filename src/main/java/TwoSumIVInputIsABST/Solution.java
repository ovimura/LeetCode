package TwoSumIVInputIsABST;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    int c = 0;
    List<Integer> vals = new ArrayList<>();
    public boolean findTarget(TreeNode root, int k) {
        traverse(root,k);
        return c>0;
    }

    private void traverse(TreeNode root, int k) {
        if(root == null || c>0)
            return;
        for(int v: vals) {
            if(v+root.val == k) {
                c++;
                return;
            }
        }
        vals.add(root.val);
        traverse(root.left, k);
        traverse(root.right, k);
    }
}
