package complementOfBaseTenInteger;

import ComplementOfBaseTenInteger.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals(5, s.bitwiseComplement(10));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertEquals(0,s.bitwiseComplement(7));
    }
}
