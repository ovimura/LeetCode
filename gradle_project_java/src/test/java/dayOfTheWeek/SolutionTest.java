package dayOfTheWeek;

import DayOfTheWeek.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals("Saturday",s.dayOfTheWeek(31,8,2019));
    }
}
