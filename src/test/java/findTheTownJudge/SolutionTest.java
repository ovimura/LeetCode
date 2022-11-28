package findTheTownJudge;

import FindTheTownJudge.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals(2,s.findJudge(2, new int[][]{{1,2}}));
    }
}
