package longestPathWithDifferentAdjacentCharacters;

import LongestPathWithDifferentAdjacentCharacters.*;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        assert 3 == s.longestPath(new int[]{-1,0,0,1,1,2}, "abacbe");
    }
}
