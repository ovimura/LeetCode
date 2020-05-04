package validAnagram;

import ValidAnagram.Solution;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals(true, s.isAnagram("anagram","nagaram"));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertEquals(false, s.isAnagram("rat","car"));
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        Assert.assertEquals(false, s.isAnagram("aacc","ccac"));
    }
}
