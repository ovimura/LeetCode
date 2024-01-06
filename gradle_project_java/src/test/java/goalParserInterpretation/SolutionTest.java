package goalParserInterpretation;

import GoalParserInterpretation.*;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        assert "Goal".equals(s.interpret("G()(al)"));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        assert "Gooooal".equals(s.interpret("G()()()()(al)"));
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        assert "alGalooG".equals(s.interpret("(al)G(al)()()G"));
    }
}
