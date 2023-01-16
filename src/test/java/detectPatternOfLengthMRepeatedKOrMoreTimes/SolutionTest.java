package detectPatternOfLengthMRepeatedKOrMoreTimes;

import DetectPatternOfLengthMRepeatedKOrMoreTimes.*;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        assert s.containsPattern(new int[]{1,2,4,4,4,4}, 2, 2);
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        assert s.containsPattern(new int[]{1,2,1,2,1,1,1,3}, 2, 2);
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        assert !s.containsPattern(new int[]{1,2,1,2,1,3}, 2, 3);
    }
}
