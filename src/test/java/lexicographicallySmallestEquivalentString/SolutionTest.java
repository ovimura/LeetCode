package lexicographicallySmallestEquivalentString;

import LexicographicallySmallestEquivalentString.*;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        assert "makkek".equals(s.smallestEquivalentString("parker", "morris", "parser"));
    }
}
