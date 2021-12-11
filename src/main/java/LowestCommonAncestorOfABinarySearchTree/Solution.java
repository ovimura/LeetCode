package LowestCommonAncestorOfABinarySearchTree;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        getAncestors(root, p, left);
        getAncestors(root, q, right);

        int lowest = Integer.MAX_VALUE;
        int idx = Math.min(left.size(), right.size());
        int i = 0;
        while(i<idx) {
            if(right.contains(left.get(i)) && left.get(i) != lowest) {
                lowest = left.get(i);
            }
            i++;
        }
        return new TreeNode(lowest);
    }

    void getAncestors(TreeNode root, TreeNode p, List<Integer> ancestors) {
        if(root == null || p == null)
            return;
        if(root.val == p.val) {
            ancestors.add(root.val);
            return;
        } else if(root.val > p.val) {
            ancestors.add(root.val);
            getAncestors(root.left, p, ancestors);
        } else if(root.val < p.val) {
            ancestors.add(root.val);
            getAncestors(root.right, p, ancestors);
        }
    }


    public TreeNode lowestCommonAncestor1(TreeNode root, TreeNode p, TreeNode q) {
        if (p.val > q.val) {
            return findLowestCommonAncestor1(root, q, p);
        }
        return findLowestCommonAncestor1(root, p, q);
    }

    private TreeNode findLowestCommonAncestor1(TreeNode node, TreeNode p, TreeNode q) {
        if (node == null) {
            return null;
        }

        if (node.val < p.val) {
            return findLowestCommonAncestor1(node.right, p, q);
        }
        if (node.val > q.val) {
            return findLowestCommonAncestor1(node.left, p, q);
        }

        return node;
    }





}
