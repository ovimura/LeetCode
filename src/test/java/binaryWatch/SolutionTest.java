package binaryWatch;

import BinaryWatch.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new String[]{"0:01","0:02","0:04","0:08","0:16","0:32","1:00","2:00","4:00","8:00"},
                s.readBinaryWatch(1).toArray(new String[]{}));
    }
}
