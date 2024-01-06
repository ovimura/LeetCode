package binaryPrefixDivisibleByFive;

import BinaryPrefixDivisibleByFive.*;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new Boolean[]{true, false, false}, s.prefixesDivBy5(new int[]{0,1,1}).toArray(new Boolean[]{}));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new Boolean[]{false, false, false}, s.prefixesDivBy5(new int[]{1,1,1}).toArray(new Boolean[]{}));
    }
}
