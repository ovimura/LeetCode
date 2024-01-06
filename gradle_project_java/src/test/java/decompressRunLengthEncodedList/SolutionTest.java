package decompressRunLengthEncodedList;

import org.junit.Assert;
import org.junit.Test;
import DecompressRunLengthEncodedList.Solution;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new int[]{2, 4, 4, 4}, s.decompressRLElist(new int[]{1, 2, 3, 4}));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new int[]{1, 3, 3}, s.decompressRLElist(new int[]{1, 1, 2, 3}));
    }
}
