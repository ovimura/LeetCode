package shuffleString;

import ShuffleString.*;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        String ss = s.restoreString("codeleet", new int[]{4,5,6,7,0,2,1,3});
        assert "leetcode".equals(ss);
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        String ss = s.restoreString("abc", new int[]{0,1,2});
        assert "abc".equals(ss);
    }
}
