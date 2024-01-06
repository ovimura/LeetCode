package richestCustomerWealth;

import RichestCustomerWealth.*;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        assert 6 == s.maximumWealth(new int[][]{{1,2,3},{3,2,1}});
    }
}
