package distributeCandiesToPeople;

import DistributeCandiesToPeople.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new int[]{1,2,3,1}, s.distributeCandies(7, 4));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new int[]{5,2,3}, s.distributeCandies(10, 3));
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new int[]{15,18,15,12}, s.distributeCandies(60, 4));
    }
}
