package reverseStringII;

import ReverseStringII.Solution;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals("sss", s.reverseStr("sss", 2));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertEquals("iuuijuuiabcd", s.reverseStr("uiuiujuibacd", 2));
        Assert.assertEquals("va", s.reverseStr("av", 2));
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        Assert.assertEquals("cabdzthr", s.reverseStr("bacdztrh", 3));
    }

}
