package dayOfTheYear;

import DayOfTheYear.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals(9, s.dayOfYear("2019-01-09"));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertEquals(41, s.dayOfYear("2019-02-10"));
    }
}
