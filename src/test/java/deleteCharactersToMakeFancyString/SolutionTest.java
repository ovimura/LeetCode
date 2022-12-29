package deleteCharactersToMakeFancyString;

import DeleteCharactersToMakeFancyString.*;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        assert "a" == s.makeFancyString("a");
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        assert "aa".equals(s.makeFancyString("aa"));
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        assert "aa".equals(s.makeFancyString("aaa"));
    }

    @Test
    public void test4() {
        Solution s = new Solution();
        assert "abbdcca".equals(s.makeFancyString("abbbbbbdccccca"));
    }
}
