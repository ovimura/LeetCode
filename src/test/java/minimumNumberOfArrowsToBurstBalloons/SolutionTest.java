package minimumNumberOfArrowsToBurstBalloons;

import MinimumNumberOfArrowsToBurstBalloons.*;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        assert 2 == s.findMinArrowShots(new int[][]{{10,16},{2,8},{1,6},{7,12}});
    }
}
