package MaximumDepthOfNaryTree;

public class Solution {
    public int maxDepth(Node root) {
        // Base case
        if (root == null)
            return 0;

        // Check for all children and find
        // the maximum depth
        int maxdepth = 0;
        for (Node it : root.children)
            maxdepth = Math.max(maxdepth,
                    maxDepth(it));
        return maxdepth + 1 ;
    }
}
