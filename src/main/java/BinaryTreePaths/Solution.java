package BinaryTreePaths;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    List<String> r = new ArrayList<>();

    public List<String> binaryTreePaths(TreeNode root) {
        helper(root, "");
        return r;
    }

    void helper(TreeNode root, String sb) {
        if(root == null)
            return;

        sb = sb+"->"+root.val;

        if(root.left == null && root.right == null) {
            r.add(sb.substring(2));
            System.out.println();
            return;
        }
        if(root.left != null)
            helper(root.left, sb);
        if(root.right != null)
            helper(root.right, sb);

    }
}
