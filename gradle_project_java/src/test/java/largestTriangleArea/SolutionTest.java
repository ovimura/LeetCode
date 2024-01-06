package largestTriangleArea;

import LargestTriangleArea.*;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        assert 1.9999999999999993 == s.largestTriangleArea(new int[][]{{0,0},{0,1},{1,0},{0,2},{2,0}});
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        assert 0.49999999999999983 == s.largestTriangleArea(new int[][]{{1,0},{0,0},{0,1}});
    }
}
