package BinaryTreePreorderTraversal;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> rs = new ArrayList<>();
        traverse(root, rs);
        return rs;
    }

    public void traverse(TreeNode root, List<Integer> nodes) {
        if(root == null)
            return;
        nodes.add(root.val);
        traverse(root.left, nodes);
        traverse(root.right, nodes);
    }
}
