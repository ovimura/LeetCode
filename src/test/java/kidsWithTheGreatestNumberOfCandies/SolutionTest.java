package kidsWithTheGreatestNumberOfCandies;

import org.junit.Assert;
import org.junit.Test;
import KidsWithTheGreatestNumberOfCandies.Solution;

import java.util.List;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        List<Boolean> res = s.kidsWithCandies(new int[]{2,3,5,1,3}, 3);
        Boolean[] result = new Boolean[res.size()];
        res.toArray(result);
        Assert.assertArrayEquals(new Boolean[]{true,true,true,false,true}, result);
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        List<Boolean> res = s.kidsWithCandies(new int[]{4,2,1,1,2}, 1);
        Boolean[] result = new Boolean[res.size()];
        res.toArray(result);
        Assert.assertArrayEquals(new Boolean[]{true,false,false,false,false}, result);
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        List<Boolean> res = s.kidsWithCandies(new int[]{12,1,12}, 10);
        Boolean[] result = new Boolean[res.size()];
        res.toArray(result);
        Assert.assertArrayEquals(new Boolean[]{true,false,true}, result);
    }
}
