package namingACompany;

import NamingACompany.*;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        assert 6 == s.distinctNames(new String[]{"coffee","donuts","time","toffee"});
    }
}
