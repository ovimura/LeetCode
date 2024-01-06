package elementAppearingMoreThanTwentyFiveInSortedArray;

import ElementAppearingMoreThanTwentyFiveInSortedArray.*;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        assert 6 == s.findSpecialInteger(new int[]{1,2,2,6,6,6,6,7,10});
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        assert 1 == s.findSpecialInteger(new int[]{1,1});
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        assert 3 == s.findSpecialInteger(new int[]{1,2,3,3});
    }
}
