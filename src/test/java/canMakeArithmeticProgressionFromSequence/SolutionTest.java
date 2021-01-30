package canMakeArithmeticProgressionFromSequence;

import CanMakeArithmeticProgressionFromSequence.Solution;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals(true, s.canMakeArithmeticProgression(new int[]{3,5,1}));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertEquals(false, s.canMakeArithmeticProgression(new int[]{13,12,-12,9,9,16,7,-10,-20,0,18,-1,-20,-10,-8,15,15,16,2,15}));
    }
}
