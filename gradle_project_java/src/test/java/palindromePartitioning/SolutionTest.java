package palindromePartitioning;

import PalindromePartitioning.*;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        List<List<String>> r = s.partition("aab");
        Assert.assertArrayEquals(
                new String[]{"a","a","b"},
                r.get(0).toArray(new String[]{})
        );
        Assert.assertArrayEquals(
                new String[]{"aa","b"},
                r.get(1).toArray(new String[]{})
        );
    }
}
