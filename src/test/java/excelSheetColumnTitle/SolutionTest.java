package excelSheetColumnTitle;

import ExcelSheetColumnTitle.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals("FXSHRXW",s.convertToTitle(2147483647));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertEquals("A",s.convertToTitle(1));
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        Assert.assertEquals("ZY",s.convertToTitle(701));
    }
}
