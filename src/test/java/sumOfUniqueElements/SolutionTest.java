package sumOfUniqueElements;

import SumOfUniqueElements.*;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        assert 4 == s.sumOfUnique(new int[]{1,2,3,2});
    }
}
