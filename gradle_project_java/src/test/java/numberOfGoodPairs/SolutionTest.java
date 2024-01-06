package numberOfGoodPairs;

import NumberOfGoodPairs.*;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        assert 4 == s.numIdenticalPairs(new int[]{1,2,3,1,1,3});
    }
}
