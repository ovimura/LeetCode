package pathCrossing;

import PathCrossing.*;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        assert !s.isPathCrossing("NES");
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        assert s.isPathCrossing("NESWW");
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        assert s.isPathCrossing("NWSEE");
    }
}
