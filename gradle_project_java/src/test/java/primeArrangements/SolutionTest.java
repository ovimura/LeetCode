package primeArrangements;

import PrimeArrangements.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals(12, s.numPrimeArrangements(5));
    }
}
