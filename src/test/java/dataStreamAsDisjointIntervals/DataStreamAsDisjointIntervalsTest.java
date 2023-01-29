package dataStreamAsDisjointIntervals;

import DataStreamAsDisjointIntervals.*;

import org.junit.Assert;
import org.junit.Test;

public class DataStreamAsDisjointIntervalsTest {
    @Test
    public void test1() {
        SummaryRanges obj = new SummaryRanges();
        obj.addNum(1);
        int[][] param_2 = obj.getIntervals();
        Assert.assertEquals(1, param_2[0][0]);
        Assert.assertEquals(1, param_2[0][1]);
    }
}
