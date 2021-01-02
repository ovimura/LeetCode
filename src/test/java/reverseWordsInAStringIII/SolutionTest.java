package reverseWordsInAStringIII;

import ReverseWordsInAStringIII.Solution;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals("s'teL ekat edoCteeL tsetnoc", s.reverseWords("Let's take LeetCode contest"));
    }
}
