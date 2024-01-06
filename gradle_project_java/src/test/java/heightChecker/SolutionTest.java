package heightChecker;

import HeightChecker.Solution;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals(3, s.heightChecker(new int[]{1,1,4,2,1,3}));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertEquals(5, s.heightChecker(new int[]{5,1,2,3,4}));
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        Assert.assertEquals(0, s.heightChecker(new int[]{1,2,3,4,5}));
    }
}
