package mostVisitedSectorInACircularTrack;

import MostVisitedSectorInACircularTrack.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new Integer[]{1,2}, s.mostVisited(4, new int[]{1,3,1,2}).toArray(new Integer[]{}));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new Integer[]{2}, s.mostVisited(2, new int[]{2,1,2,1,2,1,2,1,2}).toArray(new Integer[]{}));
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new Integer[]{1,2,3,4,5,6,7}, s.mostVisited(7, new int[]{1,3,5,7}).toArray(new Integer[]{}));
    }
}
