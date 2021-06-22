package arrayPartitionI;

import ArrayPartitionI.Solution;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals(4, s.arrayPairSum(new int[]{1,4,3,2}));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertEquals(9, s.arrayPairSum(new int[]{6,2,6,5,1,2}));
    }
}
