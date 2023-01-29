package slowestKey;

import SlowestKey.*;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        char c = s.slowestKey(new int[]{9,29,49,50}, "cbcd");
        assert c == 'c';
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        char c = s.slowestKey(new int[]{12,23,36,46,62}, "spuda");
        assert c == 'a';
    }
}
