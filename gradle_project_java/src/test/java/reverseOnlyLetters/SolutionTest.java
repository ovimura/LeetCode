package reverseOnlyLetters;

import ReverseOnlyLetters.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals("dc-ba", s.reverseOnlyLetters("ab-cd"));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertEquals("j-Ih-gfE-dCba", s.reverseOnlyLetters("a-bC-dEf-ghIj"));
    }
}
