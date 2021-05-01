package AverageOfLevelsInBinaryTree;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> avgs = new ArrayList<>();

        List<TreeNode> q = new ArrayList<>();
        q.add(root);
        avgs.add(new Double(root.val));
        while(!q.isEmpty()) {
            double sum = 0.0;
            int cnt = 0;
            List<TreeNode> tmp = new ArrayList<>();
            while (!q.isEmpty()) {
                TreeNode node = q.remove(0);
                if (node.left != null) {
                    tmp.add(node.left);
                    sum += node.left.val;
                    cnt++;
                }
                if (node.right != null) {
                    tmp.add(node.right);
                    sum += node.right.val;
                    cnt++;
                }
            }
            q = tmp;
            if (cnt != 0)
                avgs.add(sum / cnt);
        }
        return avgs;
    }
}
