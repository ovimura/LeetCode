package findTheHighestAltitude;

import FindTheHighestAltitude.*;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        assert 1 == s.largestAltitude(new int[]{-5,1,5,0,-7});
    }
}
