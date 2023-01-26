package cheapestFlightsWithinKStops;

import CheapestFlightsWithinKStops.*;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        assert 700 == s.findCheapestPrice(4, new int[][]{{0,1,100},{1,2,100},{2,0,100},{1,3,600},{2,3,200}},
                0,3,1);
    }
}
