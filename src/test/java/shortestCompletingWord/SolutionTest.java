package shortestCompletingWord;

import ShortestCompletingWord.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals("steps", s.shortestCompletingWord("1s3 PSt", new String[]{"step","steps","stripe","stepple"}));
    }
}
