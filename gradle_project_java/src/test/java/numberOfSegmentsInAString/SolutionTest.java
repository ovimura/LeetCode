package numberOfSegmentsInAString;

import NumberOfSegmentsInAString.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals(6, s.countSegments(", , , ,        a, eaefa"));
    }
}
