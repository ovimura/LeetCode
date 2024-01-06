package kthLargestElementInAStream;

import KthLargestElementInAStream.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution.KthLargest s = new Solution.KthLargest(3, new int[]{4, 5, 8, 2});
        Assert.assertEquals(4, s.add(3));
        Assert.assertEquals(5, s.add(5));
        Assert.assertEquals(5,s.add(10));
        Assert.assertEquals(8, s.add(9));
        Assert.assertEquals(8, s.add(4));
    }
}
