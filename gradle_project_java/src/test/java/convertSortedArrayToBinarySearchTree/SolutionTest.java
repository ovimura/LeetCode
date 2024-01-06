package convertSortedArrayToBinarySearchTree;

import ConvertSortedArrayToBinarySearchTree.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        TreeNode tn = s.sortedArrayToBST(new int[]{-10,-3,0,5,9});
        //s.printPreOrder(tn);
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        TreeNode tn = s.sortedArrayToBST(new int[]{1,2,3,4,5,6,7});
        //s.printPreOrder(tn);
    }
}
