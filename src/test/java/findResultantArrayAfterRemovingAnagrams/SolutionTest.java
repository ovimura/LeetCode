package findResultantArrayAfterRemovingAnagrams;

import FindResultantArrayAfterRemovingAnagrams.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new String[]{"abba","cd"}, s.removeAnagrams(new String[]{"abba","baba","bbaa","cd","cd"}).toArray(new String[]{}));
    }
}
