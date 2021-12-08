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
        Assert.assertArrayEquals(new String[]{}, r.toArray());
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        List<String> r = s.summaryRanges(new int[]{1});
        Assert.assertArrayEquals(new String[]{"1"}, r.toArray());
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        List<String> r = s.summaryRanges(new int[]{-1});
        Assert.assertArrayEquals(new String[]{"-1"}, r.toArray());
    }

    @Test
    public void test4() {
        Solution s = new Solution();
        List<String> r = s.summaryRanges(new int[]{0,2,3,4,6,8,9});
        Assert.assertArrayEquals(new String[]{"0","2->4","6","8->9"}, r.toArray());
    }

    @Test
    public void test5() {
        Solution s = new Solution();
        List<String> r = s.summaryRanges(new int[]{0,1,2,4,5,7});
        Assert.assertArrayEquals(new String[]{"0->2","4->5","7"}, r.toArray());
    }
}
