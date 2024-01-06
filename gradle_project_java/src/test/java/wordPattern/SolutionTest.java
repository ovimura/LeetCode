package wordPattern;

import WordPattern.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertTrue(s.wordPattern("abba","dog cat cat dog"));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertFalse(s.wordPattern("abba","dog cat cat fish"));
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        Assert.assertFalse(s.wordPattern("aba","dog cat cat"));
    }

    @Test
    public void test4() {
        Solution s = new Solution();
        Assert.assertFalse(s.wordPattern("abab","dog cat cat dog"));
    }

    @Test
    public void test5() {
        Solution s = new Solution();
        Assert.assertTrue(s.wordPattern1("abba","dog cat cat dog"));
    }

    @Test
    public void test6() {
        Solution s = new Solution();
        Assert.assertFalse(s.wordPattern1("abba","dog cat cat fish"));
    }

    @Test
    public void test7() {
        Solution s = new Solution();
        Assert.assertFalse(s.wordPattern1("aba","dog cat cat"));
    }

    @Test
    public void test8() {
        Solution s = new Solution();
        Assert.assertFalse(s.wordPattern1("abab","dog cat cat dog"));
    }
}
