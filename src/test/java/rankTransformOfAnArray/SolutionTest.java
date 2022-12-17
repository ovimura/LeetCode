package rankTransformOfAnArray;

import RankTransformOfAnArray.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new int[]{4,1,2,3}, s.arrayRankTransform(new int[]{40,10,20,30}));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new int[]{1,1,1}, s.arrayRankTransform(new int[]{100,100,100}));
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new int[]{5,3,4,2,8,6,7,1,3}, s.arrayRankTransform(new int[]{37,12,28,9,100,56,80,5,12}));
    }
}
