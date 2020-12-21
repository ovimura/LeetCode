package robotReturnToOrigin;

import RobotReturnToOrigin.Solution;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals(true, s.judgeCircle("UD"));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertEquals(false, s.judgeCircle("LL"));
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        Assert.assertEquals(false, s.judgeCircle("RRDD"));
    }

    @Test
    public void test4() {
        Solution s = new Solution();
        Assert.assertEquals(false, s.judgeCircle("LDRRLRUULR"));
    }
}
