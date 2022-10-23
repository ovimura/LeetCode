package reshapeTheMatrix;

import ReshapeTheMatrix.*;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.stream.Stream;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        int[][] res = s.matrixReshape(new int[][]{{1, 2},{3, 4}}, 3, 4);
        Assert.assertArrayEquals(new int[]{1,2}, res[0]);
        Assert.assertArrayEquals(new int[]{3,4}, res[1]);
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        int[][] res = s.matrixReshape(new int[][]{{1, 2},{3, 4}}, 1, 4);
        Assert.assertArrayEquals(new int[]{1,2,3,4}, res[0]);
    }
}
