package uniqueNumberOfOccurrences;

import UniqueNumberOfOccurrences.Solution;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals(true, s.uniqueOccurrences(new int[]{1,2,2,1,1,3}));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertEquals(false, s.uniqueOccurrences(new int[]{1,2}));
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        Assert.assertEquals(true, s.uniqueOccurrences(new int[]{-3,0,1,-3,1,1,1,-3,10,0}));
    }
}
