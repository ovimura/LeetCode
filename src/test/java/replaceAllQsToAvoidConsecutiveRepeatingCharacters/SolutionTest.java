package replaceAllQsToAvoidConsecutiveRepeatingCharacters;

import ReplaceAllQsToAvoidConsecutiveRepeatingCharacters.*;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        assert "azs".equals(s.modifyString("?zs"));
        assert "ubvaw".equals(s.modifyString("ubv?w"));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        assert "ababzadbabazbabcab".equals(s.modifyString("a?a?z?d?a??z?a??a?"));
    }
}
