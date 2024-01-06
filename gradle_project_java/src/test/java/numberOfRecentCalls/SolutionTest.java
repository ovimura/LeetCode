package numberOfRecentCalls;

import NumberOfRecentCalls.Solution;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals(1, s.ping(1));
        Assert.assertEquals(2, s.ping(100));
        Assert.assertEquals(3, s.ping(3001));
        Assert.assertEquals(3, s.ping(3002));
    }
}
