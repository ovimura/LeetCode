package containsDuplicateII;

import ContainsDuplicateII.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals(true, s.containsNearbyDuplicate(new int[]{1,2,3,1}, 3));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertEquals(true, s.containsNearbyDuplicate(new int[]{1,0,1,1}, 1));
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        Assert.assertEquals(false, s.containsNearbyDuplicate(new int[]{1,2,3,1,2,3}, 2));
    }
}
