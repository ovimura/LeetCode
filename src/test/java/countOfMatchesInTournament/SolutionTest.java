package countOfMatchesInTournament;

import CountOfMatchesInTournament.*;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        int r = s.numberOfMatches(7);
        assert 6 == r;
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        int r = s.numberOfMatches(14);
        assert 13 == r;
    }
}
