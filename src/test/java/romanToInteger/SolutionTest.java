package romanToInteger;

import RomanToInteger.Solution;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals(3, s.romanToInt("III"));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertEquals(4, s.romanToInt("IV"));
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        Assert.assertEquals(9, s.romanToInt("IX"));
    }

    @Test
    public void test4() {
        Solution s = new Solution();
        Assert.assertEquals(58, s.romanToInt("LVIII"));
    }

    @Test
    public void test5() {
        Solution s = new Solution();
        Assert.assertEquals(1994, s.romanToInt("MCMXCIV"));
    }
}
