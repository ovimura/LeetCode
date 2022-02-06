package FindModeInBinarySearchTree;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    int count = 1;
    int longest = 0;
    TreeNode prev = null;
    public int[] findMode(TreeNode root) {
        List<Integer> r = new ArrayList<>();
        traverse(root, r);
        int[] a = new int[r.size()];
        for(int i=0; i<r.size();i++) {
            a[i] = r.get(i);
        }
        return a;
    }

    void traverse(TreeNode root, List<Integer> list) {
        if(root == null)
            return;
        traverse(root.left, list);
        if(prev != null) {
            if(root.val == prev.val)
                count++;
            else
                count = 1;
        }
        prev = new TreeNode(root.val);
        if(count > longest) {
            longest = count;
            list.clear();
            list.add(root.val);
        } else if (count == longest) {
            list.add(root.val);
        }
        traverse(root.right, list);
    }
}
