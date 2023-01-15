package makeTheStringGreat;

import MakeTheStringGreat.*;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        String r = s.makeGood("leEeetcode");
        assert "leetcode".equals(r);
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        String r = s.makeGood("abBAcC");
        assert "".equals(r);
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        String r = s.makeGood("s");
        assert "s".equals(r);
    }

    @Test
    public void test4() {
        Solution s = new Solution();
        String r = s.makeGood("qFxXfQo");
        assert "o".equals(r);
    }
}
