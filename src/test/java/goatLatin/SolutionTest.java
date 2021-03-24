package goatLatin;

import GoatLatin.Solution;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals("Imaa peaksmaaa oatGmaaaa atinLmaaaaa", s.toGoatLatin("I speak Goat Latin"));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertEquals("heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa", s.toGoatLatin("The quick brown fox jumped over the lazy dog"));
    }
}
