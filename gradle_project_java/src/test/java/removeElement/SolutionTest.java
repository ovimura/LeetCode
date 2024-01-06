package removeElement;

import RemoveElement.Solution;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        int[] arr = new int[]{0,1,2,2,3,0,4,2};
        Assert.assertEquals(5, s.removeElement(arr, 2));
    }
}
