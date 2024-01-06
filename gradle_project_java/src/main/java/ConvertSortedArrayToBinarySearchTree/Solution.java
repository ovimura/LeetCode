package ConvertSortedArrayToBinarySearchTree;

public class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return createBST(nums, 0, nums.length-1);
    }

    public TreeNode createBST(int []nodes, int a, int b) {
        if(a>b)
            return null;
        int m = (a+b)/2;
        TreeNode n = new TreeNode(nodes[m]);
        n.left = createBST(nodes, a, m-1);
        n.right = createBST(nodes, m+1, b);
        return n;
    }

    public void printInOrder(TreeNode root) {
        if(root == null)
            return;
        printInOrder(root.left);
        System.out.print(root.val + " ");
        printInOrder(root.right);
    }

    public void printPreOrder(TreeNode root) {
        if(root == null)
            return;
        System.out.print(root.val + " ");
        printPreOrder(root.left);
        printPreOrder(root.right);
    }
}
