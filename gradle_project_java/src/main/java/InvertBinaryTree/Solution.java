package InvertBinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    public void print(TreeNode root) {
        if(root == null)
            return;
        print(root.left);
        System.out.print(root.val);
        print(root.right);
    }

    public TreeNode invertTree(TreeNode root) {
        if(root == null)
            return root;
        TreeNode l = invertTree(root.left);
        TreeNode r = invertTree(root.right);
        root.left = r;
        root.right = l;
        return root;
    }

    public TreeNode invert_tree(TreeNode root) {
        if (root == null) return null;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            TreeNode temp = current.left;
            current.left = current.right;
            current.right = temp;
            if (current.left != null) queue.add(current.left);
            if (current.right != null) queue.add(current.right);
        }
        return root;
    }
}
