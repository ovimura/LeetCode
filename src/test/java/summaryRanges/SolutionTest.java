package summaryRanges;

import SummaryRanges.*;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        List<String> r = s.summaryRanges(new int[]{});
        Assert.assertEquals(0, r.size());
    }
}
