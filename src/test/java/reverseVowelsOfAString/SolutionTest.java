package reverseVowelsOfAString;

import ReverseVowelsOfAString.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals("EASDO",s.reverseVowels("OASDE"));
    }
}
