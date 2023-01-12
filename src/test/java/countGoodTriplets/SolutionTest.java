package countGoodTriplets;

import CountGoodTriplets.*;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        int i = s.countGoodTriplets(new int[]{3,0,1,1,9,7}, 7, 2, 3);
        assert 4 == i;
    }
}
