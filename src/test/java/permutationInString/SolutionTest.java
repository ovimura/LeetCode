package permutationInString;

import PermutationInString.*;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        assert s.checkInclusion("ab", "eidbaooo");
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        assert !s.checkInclusion("ab", "eidboaoo");
    }
}
