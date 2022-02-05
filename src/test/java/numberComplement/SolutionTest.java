package numberComplement;

import NumberComplement.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals(2, s.findComplement(5));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertEquals(2, s.findComplement_1(5));
    }
}
