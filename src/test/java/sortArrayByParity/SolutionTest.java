package sortArrayByParity;

import org.junit.Assert;
import org.junit.Test;
import SortArrayByParity.Solution;

public class SolutionTest {
    @Test
    public void test1(){
        Solution s = new Solution();
        Assert.assertArrayEquals(new int[]{2,4,3,1}, s.sortArrayByParity(new int[]{3,1,2,4}));
    }
}
