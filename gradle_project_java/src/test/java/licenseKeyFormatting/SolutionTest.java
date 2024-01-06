package licenseKeyFormatting;

import LicenseKeyFormatting.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals("5F3Z-2E9W", s.licenseKeyFormatting("5F3Z-2e-9-w", 4));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertEquals("2-5G-3J", s.licenseKeyFormatting("2-5g-3-J", 2));
    }
}
