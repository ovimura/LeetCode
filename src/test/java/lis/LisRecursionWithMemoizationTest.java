package lis;

import org.junit.Assert;
import org.junit.Test;

public class LisRecursionWithMemoizationTest {
    private LisRecursionWithMemoization l;

    public LisRecursionWithMemoizationTest() {
        l = new LisRecursionWithMemoization();
    }

    @Test
    public void testEmptyArray() {
        assert(l.lengthOfLIS(new int[]{}) == 0);
    }

    @Test
    public void test2() {
        assert(l.lengthOfLIS(new int[]{10, 9, 2, 5, 3, 7, 101, 18})==4);
    }

    @Test
    public void test3() {
        Assert.assertEquals(3, l.lengthOfLIS(new int[]{10, 9, 2, 5, 3, 4}));
    }

    @Test
    public void test4() {
        Assert.assertEquals(6, l.lengthOfLIS(new int[]{1,3,6,7,9,4,10,5,6}));
    }
}
