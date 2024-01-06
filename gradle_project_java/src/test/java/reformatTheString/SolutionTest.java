package reformatTheString;

import ReformatTheString.*;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        assert s.reformat("abc123").equals("a1b2c3");
    }
}
