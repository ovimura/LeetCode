package concatenatedWords;

import ConcatenatedWords.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new String[]{"catsdogcats","dogcatsdog","ratcatdogcat"},
                s.findAllConcatenatedWordsInADict(new String[]{"cat","cats","catsdogcats","dog","dogcatsdog","hippopotamuses",
                "rat","ratcatdogcat"}).toArray(new String[]{}));
    }
}
