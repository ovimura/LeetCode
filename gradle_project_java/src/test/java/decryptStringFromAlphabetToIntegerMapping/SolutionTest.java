package decryptStringFromAlphabetToIntegerMapping;

import DecryptStringFromAlphabetToIntegerMapping.Solution;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals("jkab", s.freqAlphabets("10#11#12"));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertEquals("acz", s.freqAlphabets("1326#"));
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        Assert.assertEquals("y", s.freqAlphabets("25#"));
    }

    @Test
    public void test4() {
        Solution s = new Solution();
        Assert.assertEquals("abcdefghijklmnopqrstuvwxyz", s.freqAlphabets("12345678910#11#12#13#14#15#16#17#18#19#20#21#22#23#24#25#26#"));
    }
}
