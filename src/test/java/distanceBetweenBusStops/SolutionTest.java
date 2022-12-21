package distanceBetweenBusStops;

import DistanceBetweenBusStops.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals(1, s.distanceBetweenBusStops(new int[]{1,2,3,4}, 0, 1));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertEquals(3, s.distanceBetweenBusStops(new int[]{1,2,3,4}, 0, 2));
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        Assert.assertEquals(17, s.distanceBetweenBusStops(new int[]{7,10,1,12,11,14,5,0}, 7, 2));
    }
}
