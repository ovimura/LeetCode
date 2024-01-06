package firstUniqueCharacterInAString;

import FirstUniqueCharacterInAString.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals(0, s.firstUniqChar("leetcode"));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertEquals(2, s.firstUniqChar("loveleetcode"));
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        Assert.assertEquals(-1, s.firstUniqChar("aabb"));
    }
}
