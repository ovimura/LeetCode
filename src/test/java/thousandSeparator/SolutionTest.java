package thousandSeparator;

import ThousandSeparator.*;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        String ss = s.thousandSeparator(987);
        assert "987".equals(ss);
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        String ss = s.thousandSeparator(1198075105);
        assert "1.198.075.105".equals(ss);
    }
}
