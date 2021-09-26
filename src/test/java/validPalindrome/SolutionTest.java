package validPalindrome;

import ValidPalindrome.Solution;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals(true, s.isPalindrome("A man, a plan, a canal: Panama"));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertEquals(false, s.isPalindrome("race a car"));
    }
}
