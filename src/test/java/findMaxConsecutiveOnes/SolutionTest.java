package findMaxConsecutiveOnes;
import FindMaxConsecutiveOnes.Solution;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals(3, s.findMaxConsecutiveOnes(new int[]{1,1,0,1,1,1}));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertEquals(2, s.findMaxConsecutiveOnes(new int[]{1,0,1,1,0,1}));
    }
}
