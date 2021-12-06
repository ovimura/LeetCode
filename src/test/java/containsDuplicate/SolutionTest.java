package containsDuplicate;

import ContainsDuplicate.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals(true, s.containsDuplicate(new int[]{1,2,3,1}));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertEquals(false, s.containsDuplicate(new int[]{1,2,3,4}));
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        Assert.assertEquals(true, s.containsDuplicate(new int[]{1,1,1,3,3,4,3,2,4,2}));
    }
}
