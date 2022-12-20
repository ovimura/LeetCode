package reformatDate;

import ReformatDate.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals("2052-10-20", s.reformatDate("20th Oct 2052"));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertEquals("2052-10-01", s.reformatDate("1st Oct 2052"));
    }
}
