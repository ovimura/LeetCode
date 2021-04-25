package smallestRangeI;

import org.junit.Assert;
import org.junit.Test;

import SmallestRangeI.Solution;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals(s.smallestRangeI(new int[]{1}, 0),0);
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertEquals(s.smallestRangeI(new int[]{0,10}, 2),6);
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        Assert.assertEquals(s.smallestRangeI(new int[]{1,3,6}, 3),0);
    }

    @Test
    public void test4() {
        Solution s = new Solution();
        Assert.assertEquals(s.smallestRangeI_sol1(new int[]{1,7,4,8,8}, 0),7);
    }

    @Test
    public void test5() {
        Solution s = new Solution();
        Assert.assertEquals(s.smallestRangeI_sol1(new int[]{1}, 0),0);
    }

    @Test
    public void test6() {
        Solution s = new Solution();
        Assert.assertEquals(s.smallestRangeI_sol1(new int[]{0,10}, 2),6);
    }

    @Test
    public void test7() {
        Solution s = new Solution();
        Assert.assertEquals(s.smallestRangeI_sol1(new int[]{1,3,6}, 3),0);
    }

    @Test
    public void test8() {
        Solution s = new Solution();
        Assert.assertEquals(s.smallestRangeI_sol1(new int[]{1,7,4,8,8}, 0),7);
    }
}



