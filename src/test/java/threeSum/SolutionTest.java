package threeSum;

import ThreeSum.Solution;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class SolutionTest {

    @Test
    public void test1() {
        Solution s = new Solution();
        int[] arr = new int[]{-1, 0, 1, 2, -1, -4};
        List<List<Integer>> listList = s.threeSum(arr);
        //System.out.println(listList.size());
        for (List<Integer> is:listList
             ) {
            //System.out.println(is.size());
            for (Integer i: is
                 ) {
                System.out.print(i);
            }
            System.out.println();
        }
        Assert.assertEquals("[[-1, -1, 2], [-1, 0, 1]]", listList.toString());
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        int[] arr = new int[]{-1, 0, 1, 2, -1, -4};
        List<List<Integer>> listList = s.threeSum2(arr);
        //System.out.println(listList.size());
        for (List<Integer> is:listList
        ) {
            for (Integer i: is
            ) {
                System.out.print(i);
            }
            System.out.println();
        }
        Assert.assertEquals("[[-1, -1, 2], [-1, 0, 1]]", listList.toString());
    }

    @Test
    public void test4() {
        Solution s = new Solution();
        int[] arr = new int[]{-1, 0, 1, 2, -1, -4};
        List<List<Integer>> listList = s.threeSum3(arr);
        Assert.assertEquals("[[-1, -1, 2], [-1, 0, 1]]", listList.toString());
    }
}
