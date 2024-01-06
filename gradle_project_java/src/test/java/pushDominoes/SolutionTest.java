package pushDominoes;

import PushDominoes.Solution;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        System.out.println(".L.R...LR..L..");
        Assert.assertEquals("LL.RR.LLRRLL..", s.pushDominoes(".L.R...LR..L.."));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertEquals("RR.L", s.pushDominoes("RR.L"));
    }
}
