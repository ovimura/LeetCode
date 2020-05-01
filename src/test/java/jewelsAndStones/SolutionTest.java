package jewelsAndStones;

import JewelsAndStones.Solution;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        String J = "aA";
        String S = "aAAbbbb";
        Solution s = new Solution();
        Assert.assertEquals(3, s.numJewelsInStones(J, S));
    }

    @Test
    public void test2() {
        String J = "z";
        String S = "ZZ";
        Solution s = new Solution();
        Assert.assertEquals(0, s.numJewelsInStones(J, S));
    }

    @Test
    public void test3() {
        String J = "aA";
        String S = "aAAbbbb";
        Solution s = new Solution();
        Assert.assertEquals(3, s.numJewelsInStones(J, S));
    }
}
