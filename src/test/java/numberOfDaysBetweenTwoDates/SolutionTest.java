package numberOfDaysBetweenTwoDates;

import NumberOfDaysBetweenTwoDates.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals(1, s.daysBetweenDates("2019-06-29", "2019-06-30"));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertEquals(15, s.daysBetweenDates("2020-01-15", "2019-12-31"));
    }
}
