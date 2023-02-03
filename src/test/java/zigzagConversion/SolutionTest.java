package zigzagConversion;

import ZigzagConversion.*;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        assert "PAHNAPLSIIGYIR".equals(s.convert("PAYPALISHIRING", 3));
    }
}
