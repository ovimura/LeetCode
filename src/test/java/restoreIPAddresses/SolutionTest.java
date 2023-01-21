package restoreIPAddresses;

import RestoreIPAddresses.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new String[]{"255.255.11.135","255.255.111.35"},
                s.restoreIpAddresses("25525511135").toArray(new String[]{}));
    }
}
