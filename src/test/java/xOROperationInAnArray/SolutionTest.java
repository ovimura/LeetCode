package xOROperationInAnArray;

import XOROperationInAnArray.Solution;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals(8, s.xorOperation(5, 0));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertEquals(8, s.xorOperation(4, 3));
    }
}
