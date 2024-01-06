package countBinarySubstrings;

import CountBinarySubstrings.*;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        assert 3 == (s.countBinarySubstrings("1010"));
    }
}
