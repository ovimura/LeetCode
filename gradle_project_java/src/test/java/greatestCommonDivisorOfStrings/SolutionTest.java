package greatestCommonDivisorOfStrings;

import GreatestCommonDivisorOfStrings.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals("AB", s.gcdOfStrings("ABABAB", "ABAB"));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertEquals("", s.gcdOfStrings("LEET", "CODE"));
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        Assert.assertEquals("ABC", s.gcdOfStrings("ABCABC", "ABC"));
    }

    @Test
    public void test4() {
        Solution s = new Solution();
        Assert.assertEquals("TAUXX", s.gcdOfStrings("TAUXXTAUXXTAUXXTAUXXTAUXX","TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX"));
    }

    @Test
    public void test5() {
        Solution s = new Solution();
        Assert.assertEquals("TAUXX", s.gcdOfStrings("TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX", "TAUXXTAUXXTAUXXTAUXXTAUXX"));
    }
}
