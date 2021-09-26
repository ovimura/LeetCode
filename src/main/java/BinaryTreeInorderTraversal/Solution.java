package BinaryTreeInorderTraversal;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        helper(root, result);
        return result;
    }

    public void helper(TreeNode root, List<Integer> list) {
        if(root == null)
            return;
        helper(root.left, list);
        list.add(root.val);
        helper(root.right, list);
    }
}
