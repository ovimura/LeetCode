package defangingAnIPAddress;

import org.junit.Assert;
import org.junit.Test;
import DefangingAnIPAddress.*;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals("1[.]1[.]1[.]1", s.defangIPaddr("1.1.1.1"));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertEquals("255[.]100[.]50[.]0", s.defangIPaddr("255.100.50.0"));
    }
}
