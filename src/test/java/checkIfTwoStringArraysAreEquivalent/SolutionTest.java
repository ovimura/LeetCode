package checkIfTwoStringArraysAreEquivalent;

import CheckIfTwoStringArraysAreEquivalent.*;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        assert s.arrayStringsAreEqual(new String[]{"ab", "c"}, new String[]{"a", "bc"});
    }
}
