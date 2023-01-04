package minimumRoundsToCompleteAllTasks;

import MinimumRoundsToCompleteAllTasks.*;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        assert 4 == s.minimumRounds(new int[]{2,2,3,3,2,4,4,4,4,4});
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        assert -1 == (s.minimumRounds(new int[]{2,3,3}));
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        assert (20 == s.minimumRounds(new int[]{69,65,62,64,70,68,69,67,60,65,69,62,65,65,61,66,68,61,65,63,60,66,68,66,67,65,63,65,70,69,70,62,68,70,60,68,65,61,64,65,63,62,62,62,67,62,62,61,66,69}));
    }
}
