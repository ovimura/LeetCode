package BinaryTreePostorderTraversal;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> rs = new ArrayList<>();
        traversal(root, rs);
        return rs;
    }

    public void traversal(TreeNode root, List<Integer> nodes) {
        if(root == null)
            return;
        traversal(root.left, nodes);
        traversal(root.right, nodes);
        nodes.add(root.val);
    }
}
