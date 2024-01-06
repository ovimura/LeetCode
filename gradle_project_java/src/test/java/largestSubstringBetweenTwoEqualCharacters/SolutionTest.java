package largestSubstringBetweenTwoEqualCharacters;

import LargestSubstringBetweenTwoEqualCharacters.*;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        assert 0 == s.maxLengthBetweenEqualCharacters("aa");
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        int r = s.maxLengthBetweenEqualCharacters("abca");
        assert 2 == r;
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        int r = s.maxLengthBetweenEqualCharacters("cbzxy");
        assert -1 == r;
    }
}
