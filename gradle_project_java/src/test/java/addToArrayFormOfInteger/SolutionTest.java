package addToArrayFormOfInteger;

import AddToArrayFormOfInteger.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new Integer[]{1,2,3,4}, s.addToArrayForm(new int[]{1,2,0,0}, 34).toArray(new Integer[]{}));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new Integer[]{1,1,4,9}, s.addToArrayForm(new int[]{9,9,9}, 150).toArray(new Integer[]{}));
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new Integer[]{1,3,2}, s.addToArrayForm(new int[]{9}, 123).toArray(new Integer[]{}));
    }
}
