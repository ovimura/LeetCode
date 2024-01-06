package checkIfAWordOccursAsAPrefixOfAnyWordInASentence;

import CheckIfAWordOccursAsAPrefixOfAnyWordInASentence.*;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        assert 4 == s.isPrefixOfWord("i love eating burger", "burg");
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        assert 2 == s.isPrefixOfWord("this problem is an easy problem", "pro");
    }
}
