package rangeSumQueryImmutable;

import RangeSumQueryImmutable.*;

import org.junit.Assert;
import org.junit.Test;

public class NumArrayTest {
    @Test
    public void test1() {
        NumArray na = new NumArray(new int[]{1});
        Assert.assertEquals(1, na.sumRange(0,0));
    }

    @Test
    public void test2() {
        NumArray na = new NumArray(new int[]{1,2,3});
        Assert.assertEquals(5, na.sumRange(1,2));
    }
}
