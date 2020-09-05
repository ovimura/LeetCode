package replaceElementsWithGreatestElementOnRightSide;

import org.junit.Assert;
import org.junit.Test;
import ReplaceElementsWithGreatestElementOnRightSide.Solution;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new int[]{18,6,6,6,1,-1}, s.replaceElements(new int[]{17,18,5,4,6,1}));
    }
}
