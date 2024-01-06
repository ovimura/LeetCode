package reverseBits;

import ReverseBits.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals(3221225471L,s.reverseBits(4294967293L));
        Assert.assertEquals(964176192,s.reverseBits(43261596));
        Assert.assertEquals(964176192,s.reverseBits1(43261596));
    }
}
