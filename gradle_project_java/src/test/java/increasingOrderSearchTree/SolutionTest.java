package increasingOrderSearchTree;

import IncreasingOrderSearchTree.Solution;
import IncreasingOrderSearchTree.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SolutionTest {

    @Test
    public void test1() {
        Solution s = new Solution();
        TreeNode root = new TreeNode(5, new TreeNode(3, new TreeNode(2, new TreeNode(1), null), new TreeNode(4)),
                new TreeNode(6, null, new TreeNode(8, new TreeNode(7), new TreeNode(9))));
        TreeNode r = s.increasingBST(root);
        List<Integer> list = new ArrayList<>();
        while(r != null) {
            list.add(r.val);
            r = r.right;
        }
        Integer[] arr = new Integer[list.size()];
        Assert.assertArrayEquals(new Integer[]{1,2,3,4,5,6,7,8,9}, list.toArray(arr));
    }
}
