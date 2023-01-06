package maximumIceCreamBars;

import MaximumIceCreamBars.*;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        assert 4 == s.maxIceCream(new int[]{1,3,2,4,1}, 7);
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        assert 0 == s.maxIceCream(new int[]{10,6,8,7,7,8}, 5);
    }
}
