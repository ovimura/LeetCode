package nRepeatedElementInSize2NArray;

import NRepeatedElementInSize2NArray.Solution;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals(3, s.repeatedNTimes(new int[]{1,2,3,3}));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertEquals(2, s.repeatedNTimes(new int[]{2,1,2,5,3,2}));
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        Assert.assertEquals(5, s.repeatedNTimes(new int[]{5,1,5,2,5,3,5,4}));
    }
}
