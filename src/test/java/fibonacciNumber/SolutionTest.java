package fibonacciNumber;

import FibonacciNumber.Solution;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void tes1() {
        Solution s = new Solution();
        Assert.assertEquals(1, s.fib(2));
    }

    @Test
    public void tes2() {
        Solution s = new Solution();
        Assert.assertEquals(2, s.fib(3));
    }

    @Test
    public void tes3() {
        Solution s = new Solution();
        Assert.assertEquals(3, s.fib(4));
    }
}
