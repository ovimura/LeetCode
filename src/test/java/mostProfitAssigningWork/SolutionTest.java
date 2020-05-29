package mostProfitAssigningWork;

import MostProfitAssigningWork.Solution;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        int[] difficulty = new int[]{2,4,6,8,10};
        int[] profit = new int[]{10,20,30,40,50};
        int[] worker = new int[]{4,5,6,7};
        Assert.assertEquals(100, s.maxProfitAssignment(difficulty, profit, worker));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        int[] difficulty = new int[]{2,4,6,8,10};
        int[] profit = new int[]{10,20,30,40,50};
        int[] worker = new int[]{4,5,6,7};
        //Assert.assertEquals(100, s.util(difficulty, profit, worker));
        s.util(difficulty, profit, worker);
    }
}
