package bestTeamWithNoConflicts;

import BestTeamWithNoConflicts.*;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        assert 34 == s.bestTeamScore(new int[]{1,3,5,10,15}, new int[]{1,2,3,4,5});
    }
}
