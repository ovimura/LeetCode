package LeafSimilarTrees;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leafs = new ArrayList<>();
        List<Integer> leafs2 = new ArrayList<>();
        traverse(root1, leafs);
        traverse(root2, leafs2);
        if(leafs.size() != leafs2.size())
            return false;
        else {
            for (int i=0; i<leafs.size(); i++) {
                if(leafs.get(i) != leafs2.get(i)) {
                    return false;
                }
            }
            return true;
        }
    }

    private void traverse(TreeNode root, List<Integer> leafs) {
        if(root == null)
            return;
        if(root.left == null && root.right == null)
            leafs.add(root.val);
        traverse(root.left, leafs);
        traverse(root.right, leafs);
    }
}
