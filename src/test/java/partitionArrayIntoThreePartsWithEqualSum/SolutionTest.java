package partitionArrayIntoThreePartsWithEqualSum;

import PartitionArrayIntoThreePartsWithEqualSum.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertTrue(s.canThreePartsEqualSum(new int[]{0, 0, 0}));
    }
}
