package mergeSortedArray;

import MergeSortedArray.Solution;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        int[] a1 = new int[]{1,2,3,0,0,0};
        int[] a2 = new int[]{2,5,6};
        s.merge(a1, 3, a2, 3);
        for (int i:a1
             ) {
            System.out.print(i);
        }
        Assert.assertArrayEquals(new int[]{1,2,2,3,5,6}, a1);
    }
}
