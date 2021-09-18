package lengthOfLastWord;

import LengthOfLastWord.Solution;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals(5, s.lengthOfLastWord("Hello World"));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertEquals(4, s.lengthOfLastWord("   fly me   to   the moon  "));
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        Assert.assertEquals(6, s.lengthOfLastWord("luffy is still joyboy"));
    }
}
