package createTargetArrayInTheGivenOrder;

import org.junit.Assert;
import org.junit.Test;
import CreateTargetArrayInTheGivenOrder.Solution;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new int[]{0,4,1,3,2}, s.createTargetArray(new int[]{0,1,2,3,4}, new int[]{0,1,2,2,1}));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new int[]{0,1,2,3,4}, s.createTargetArray(new int[]{1,2,3,4,0}, new int[]{0,1,2,3,0}));
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new int[]{1}, s.createTargetArray(new int[]{1}, new int[]{0}));
    }

    @Test
    public void test4() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new int[]{1}, s.createTargetArray1(new int[]{1}, new int[]{0}));
    }

    @Test
    public void test5() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new int[]{0,4,1,3,2}, s.createTargetArray1(new int[]{0,1,2,3,4}, new int[]{0,1,2,2,1}));
    }

    @Test
    public void test6() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new int[]{0,1,2,3,4}, s.createTargetArray1(new int[]{1,2,3,4,0}, new int[]{0,1,2,3,0}));
    }

    @Test
    public void test7() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new int[]{1}, s.createTargetArray2(new int[]{1}, new int[]{0}));
    }

    @Test
    public void test8() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new int[]{0,4,1,3,2}, s.createTargetArray2(new int[]{0,1,2,3,4}, new int[]{0,1,2,2,1}));
    }

    @Test
    public void test9() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new int[]{0,1,2,3,4}, s.createTargetArray2(new int[]{1,2,3,4,0}, new int[]{0,1,2,3,0}));
    }
}
