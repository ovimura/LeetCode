package numberOfGoodPaths;

import NumberOfGoodPaths.*;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void test1() {
        Solution s = new Solution();
        int r = s.numberOfGoodPaths(new int[]{1,3,2,1,3}, new int[][]{{0,1},{0,2},{2,3},{2,4}});

        assert 6 == r;
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        int r = s.numberOfGoodPaths_second_sol(new int[]{1,3,2,1,3}, new int[][]{{0,1},{0,2},{2,3},{2,4}});

        assert 6 == r;
    }
}
