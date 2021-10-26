package excelSheetColumnNumber;

import ExcelSheetColumnNumber.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals(1, s.titleToNumber("A"));
    }
}
