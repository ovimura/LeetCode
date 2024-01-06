package backspaceStringCompare;

import BackspaceStringCompare.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals(true, s.backspaceCompare("ab#c", "ad#c"));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertEquals(true, s.backspaceCompare("ab##", "c#d#"));
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        Assert.assertEquals(false, s.backspaceCompare("a#c", "b"));
    }

    @Test
    public void test4() {
        Solution s = new Solution();
        Assert.assertEquals(true, s.backspaceCompare("a##c", "#a#c"));
    }

    @Test
    public void test5() {
        Solution s = new Solution();
        Assert.assertEquals(true, s.backspaceCompare("j##xfix", "j###xfix"));
    }
}
