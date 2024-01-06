package rearrangeSpacesBetweenWords;

import RearrangeSpacesBetweenWords.*;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        String r = s.reorderSpaces("  this   is  a sentence ");
        assert "this   is   a   sentence".equals(r);
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        String r = s.reorderSpaces(" practice   makes   perfect");
        assert "practice   makes   perfect ".equals(r);
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        String r = s.reorderSpaces("  hello");
        assert "hello  ".equals(r);
    }

    @Test
    public void test4() {
        Solution s = new Solution();
        String r = s.reorderSpaces("a b   c d");
        assert "a b c d  ".equals(r);
    }

    @Test
    public void test5() {
        Solution s = new Solution();
        String r = s.reorderSpaces("    k               bwgbsqq    rhjrm    ");
        assert "k             bwgbsqq             rhjrm ".equals(r);
    }
}
