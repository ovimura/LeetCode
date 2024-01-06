package maximumNumberOfBalloons;

import MaximumNumberOfBalloons.*;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        assert 1 == s.maxNumberOfBalloons("nlaebolko");
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        assert 2 == s.maxNumberOfBalloons("loonbalxballpoon");
    }
}
