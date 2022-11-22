package transposeMatrix;

import TransposeMatrix.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        int [][] r = s.transpose(new int[][]{{1, 2, 4}, {0, 23, 5}});
        Assert.assertArrayEquals(new int[]{1,0}, r[0]);
        Assert.assertArrayEquals(new int[]{2,23}, r[1]);
        Assert.assertArrayEquals(new int[]{4,5}, r[2]);
    }
}
