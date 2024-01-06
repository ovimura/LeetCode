package findSmallestLetterGreaterThanTarget;

import FindSmallestLetterGreaterThanTarget.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals('f', s.nextGreatestLetter(new char[]{'c','f','j'}, 'c'));
    }
}
