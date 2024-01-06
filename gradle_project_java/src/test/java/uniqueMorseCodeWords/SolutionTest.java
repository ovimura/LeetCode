package uniqueMorseCodeWords;

import UniqueMorseCodeWords.Solution;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals(2, s.uniqueMorseRepresentations(new String[]{"gin", "zen", "gig", "msg"}));
    }
}
