package numberOfEquivalentDominoPairs;

import NumberOfEquivalentDominoPairs.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals(1, s.numEquivDominoPairs(new int[][]{{1, 2}, {2, 1}, {3, 4}, {5, 6}}));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertEquals(3, s.numEquivDominoPairs(new int[][]{{1,2},{1,2},{1,1},{1,2},{2,2}}));
    }
}
