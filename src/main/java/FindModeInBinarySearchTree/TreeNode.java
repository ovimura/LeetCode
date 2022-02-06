package FindModeInBinarySearchTree;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {}

    public TreeNode(int v) {
        this.val = v;
    }

    public TreeNode(int v, TreeNode l, TreeNode r) {
        this.val = v;
        this.left = l;
        this.right = r;
    }
}
