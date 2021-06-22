package sortArrayByParityII;

import SortArrayByParityII.Solution;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new int[]{4,5,2,7}, s.sortArrayByParityII(new int[]{4,2,5,7}));
    }
}
