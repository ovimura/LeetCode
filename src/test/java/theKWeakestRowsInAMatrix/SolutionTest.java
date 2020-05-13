package theKWeakestRowsInAMatrix;

import TheKWeakestRowsInAMatrix.Solution;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        int[][] m = new int[][] {{1,1,0,0,0}, {1,1,1,1,0}, {1,0,0,0,0}, {1,1,0,0,0}, {1,1,1,1,1}};
        Assert.assertEquals("[2, 0, 3]", Arrays.toString(s.kWeakestRows(m, 3)));
    }
}
