package majorityElement;

import MajorityElement.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals(3, s.majorityElement(new int[]{3,2,3}));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertEquals(2, s.majorityElement(new int[]{2,2,1,1,1,2,2}));
    }
}
