package countTheNumberOfConsistentStrings;

import CountTheNumberOfConsistentStrings.*;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        assert 2 == s.countConsistentStrings("ab", new String[]{"ad","bd","aaab","baa","badab"});
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        assert 7 == s.countConsistentStrings("abc", new String[]{"a","b","c","ab","ac","bc","abc"});
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        assert 4 == s.countConsistentStrings("cad", new String[]{"cc","acd","b","ba","bac","bad","ac","d"});
    }
}
