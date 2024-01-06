package minimumCostToMoveChipsToTheSamePosition;

import MinimumCostToMoveChipsToTheSamePosition.Solution;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals(1, s.minCostToMoveChips(new int[]{1,2,3}));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertEquals(2, s.minCostToMoveChips(new int[]{2,2,2,3,3}));
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        Assert.assertEquals(1, s.minCostToMoveChips(new int[]{1,1000000000}));
    }

    @Test
    public void test4() {
        Solution s = new Solution();
        Assert.assertEquals(1, s.minCostToMoveChips(new int[]{2,3,3}));
    }

    @Test
    public void test5() {
        Solution s = new Solution();
        Assert.assertEquals(4, s.minCostToMoveChips(new int[]{6,4,7,8,2,10,2,7,9,7}));
    }
}
