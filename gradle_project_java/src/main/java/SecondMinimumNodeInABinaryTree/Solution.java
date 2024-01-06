package SecondMinimumNodeInABinaryTree;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    Set<Integer> vals = new HashSet<>();

    public int findSecondMinimumValue(TreeNode root) {
        traverse(root);
        Integer [] r = vals.toArray(new Integer[1]);
        Arrays.sort(r);
        if(r.length < 2)
            return -1;
        else
            return r[1];
    }

    void traverse(TreeNode root) {
        if(root == null)
            return;
        vals.add(root.val);
        traverse(root.left);
        traverse(root.right);
    }
}
