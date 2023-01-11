package minimumTimeToCollectAllApplesInATree;

import MinimumTimeToCollectAllApplesInATree.*;

import org.junit.Test;

import java.util.Arrays;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        assert 8 == s.minTime(7, new int[][]{{0,1},{0,2},{1,4},{1,5},{2,3},{2,6}}, Arrays.asList(false,false,true,false,true,true,false));
    }
}
