package googleInterview;

import org.junit.Assert;
import org.junit.Test;
import GoogleInterview.MaxWater;

public class MaxWaterTest {
    @Test
    public void test1() {
        MaxWater s = new MaxWater();
        Assert.assertEquals(2, s.maxWater(new int[]{0,0,2,0,2,0}));
    }
}
