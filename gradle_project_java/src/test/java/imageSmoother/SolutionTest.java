package imageSmoother;

import ImageSmoother.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        int[][] r = s.imageSmoother(new int[][]{{100,200,100},{200,50,200},{100,200,100}});
        Assert.assertArrayEquals(new int[]{137,141,137}, r[0]);
        Assert.assertArrayEquals(new int[]{141,138,141}, r[1]);
        Assert.assertArrayEquals(new int[]{137,141,137}, r[2]);
    }
}
