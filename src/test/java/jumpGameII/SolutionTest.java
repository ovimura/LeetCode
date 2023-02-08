package jumpGameII;

import JumpGameII.*;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        assert 2 == s.jump(new int[]{2,3,1,1,4});
    }
}
