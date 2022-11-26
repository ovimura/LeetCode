package verifyingAnAlienDictionary;

import VerifyingAnAlienDictionary.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertTrue(s.isAlienSorted(new String[]{"hello","leetcode"}, "hlabcdefgijkmnopqrstuvwxyz"));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertFalse(s.isAlienSorted(new String[]{"word","world","row"}, "worldabcefghijkmnpqstuvxyz"));
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        Assert.assertFalse(s.isAlienSorted(new String[]{"apple","app"}, "abcdefghijklmnopqrstuvwxyz"));
    }
}
