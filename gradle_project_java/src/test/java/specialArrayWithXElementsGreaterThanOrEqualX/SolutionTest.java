package specialArrayWithXElementsGreaterThanOrEqualX;

import SpecialArrayWithXElementsGreaterThanOrEqualX.*;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        assert 2 == (s.specialArray(new int[]{3,5}));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        assert -1 == (s.specialArray(new int[]{0,0}));
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        assert 3 == (s.specialArray(new int[]{0,4,3,0,4}));
    }


    @Test
    public void test4() {
        Solution s = new Solution();
        assert -1 == (s.specialArray(new int[]{3,6,7,7,0}));
    }
}
