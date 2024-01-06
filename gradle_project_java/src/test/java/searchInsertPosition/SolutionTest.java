package searchInsertPosition;

import SearchInsertPosition.Solution;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals(2, s.searchInsert(new int[]{1,3,5,6}, 5));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertEquals(1, s.searchInsert(new int[]{1,3,5,6}, 2));
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        Assert.assertEquals(4, s.searchInsert(new int[]{1,3,5,6}, 7));
    }

    @Test
    public void test4() {
        Solution s = new Solution();
        Assert.assertEquals(0, s.searchInsert(new int[]{1,3,5,6}, 0));
    }

    @Test
    public void test5() {
        Solution s = new Solution();
        Assert.assertEquals(3, s.searchInsert(new int[]{1,3,5,7}, 6));
    }
}
