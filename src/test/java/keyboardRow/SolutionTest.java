package keyboardRow;

import KeyboardRow.Solution;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new String[]{"Alaska","Dad"}, s.findWords(new String[]{"Hello","Alaska","Dad","Peace"}));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new String[]{}, s.findWords(new String[]{"omk"}));
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new String[]{"adsdf","sfd"}, s.findWords(new String[]{"adsdf","sfd"}));
    }
}
