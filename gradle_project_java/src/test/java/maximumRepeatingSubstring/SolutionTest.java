package maximumRepeatingSubstring;

import MaximumRepeatingSubstring.*;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        int r = s.maxRepeating("ababc", "ab");
        assert 2 == r;
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        int r = s.maxRepeating("ababc", "ba");
        assert 1 == r;
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        int r = s.maxRepeating("ababc", "ac");
        assert 0 == r;
    }

    @Test
    public void test4() {
        Solution s = new Solution();
        int r = s.maxRepeating("aaa", "a");
        assert 3 == r;
    }

    @Test
    public void test5() {
        Solution s = new Solution();
        int r = s.maxRepeating("aaabaaaabaaabaaaabaaaabaaaabaaaaba", "aaaba");
        assert 5 == r;
    }
}
