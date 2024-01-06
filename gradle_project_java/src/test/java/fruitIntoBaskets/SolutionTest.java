package fruitIntoBaskets;

import FruitIntoBaskets.*;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        assert 3 == s.totalFruit(new int[]{1,2,1});
    }
}
