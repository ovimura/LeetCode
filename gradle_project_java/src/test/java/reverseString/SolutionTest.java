package reverseString;

import ReverseString.Solution;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        char[] arr = new char[]{'h','e','l','l','o'};
        s.reverseString(arr);
        Assert.assertArrayEquals(new char[]{'o','l','l','e','h'}, arr);
    }
    @Test
    public void test2() {
        Solution s = new Solution();
        char[] arr = new char[]{'H','a','n','n','a','h'};
        s.reverseString(arr);
        Assert.assertArrayEquals(new char[]{'h','a','n','n','a','H'}, arr);
    }
}
