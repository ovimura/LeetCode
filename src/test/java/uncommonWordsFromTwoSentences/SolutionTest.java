package uncommonWordsFromTwoSentences;

import UncommonWordsFromTwoSentences.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new String[]{"sweet", "sour"}, s.uncommonFromSentences("this apple is sweet", "this apple is sour"));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new String[]{"banana"}, s.uncommonFromSentences("apple apple", "banana"));
    }
}
