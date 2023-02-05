package findAllAnagramsInAString;

import FindAllAnagramsInAString.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new Integer[]{}, s.findAnagrams("", "").toArray(new Integer[]{}));
    }
}
