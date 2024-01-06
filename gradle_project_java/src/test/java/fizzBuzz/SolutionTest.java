package fizzBuzz;

import FizzBuzz.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new String[]{"1", "2", "Fizz"}, s.fizzBuzz(3).toArray());
    }
}
