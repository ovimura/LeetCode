package stringMatchingInAnArray;

import StringMatchingInAnArray.*;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new String[]{"as","hero"}, s.stringMatching(new String[]{"mass","as","hero","superhero"}).toArray(new String[]{}));
    }
}
