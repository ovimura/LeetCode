package primeNumberOfSetBitsInBinaryRepresentation;

import PrimeNumberOfSetBitsInBinaryRepresentation.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals(4, s.countPrimeSetBits(6,10));
    }
}
