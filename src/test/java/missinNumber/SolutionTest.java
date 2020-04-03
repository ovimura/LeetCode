package missinNumber;

import MissingNumber.Solution;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    Solution s = new Solution();

    @Test
    public void test1() {
        Assert.assertEquals(2, s.missingNumber(new int[]{3,0,1}));
    }

    @Test
    public void test2() {
        Assert.assertEquals(8, s.missingNumber(new int[]{9,6,4,2,3,5,7,0,1}));
    }
}
