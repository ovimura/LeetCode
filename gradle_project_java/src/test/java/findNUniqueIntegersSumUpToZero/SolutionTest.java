package findNUniqueIntegersSumUpToZero;

import FindNUniqueIntegersSumUpToZero.Solution;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new int[]{-2,-1, 1, 2}, s.sumZero(4));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new int[]{-2,-1, 0, 1, 2}, s.sumZero(5));
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new int[]{-1, 0, 1}, s.sumZero(3));
    }

    @Test
    public void test4() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new int[]{0}, s.sumZero(1));
    }
}
