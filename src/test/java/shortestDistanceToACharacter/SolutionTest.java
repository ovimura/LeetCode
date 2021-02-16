package shortestDistanceToACharacter;

import ShortestDistanceToACharacter.Solution;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new int[]{3,2,1,0,1,0,0,1,2,2,1,0}, s.shortestToChar("loveleetcode", 'e'));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new int[]{3,2,1,0}, s.shortestToChar("aaab", 'b'));
    }
}
