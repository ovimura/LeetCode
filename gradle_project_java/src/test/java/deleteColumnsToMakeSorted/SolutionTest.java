package deleteColumnsToMakeSorted;

import org.junit.Assert;
import org.junit.Test;

import DeleteColumnsToMakeSorted.Solution;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals(1, s.minDeletionSize(new String[]{"cba","daf","ghi"}));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertEquals(0, s.minDeletionSize(new String[]{"a","b"}));
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        Assert.assertEquals(3, s.minDeletionSize(new String[]{"zyx","wvu","tsr"}));
    }
}
