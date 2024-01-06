package googleInterview;

import GoogleInterview.Tutorial;
import org.junit.Assert;
import org.junit.Test;

public class TutorialTest {
    @Test
    public void test1() {
        Tutorial t = new Tutorial();
        Assert.assertEquals(123, t.sumNumbers("abc123xyz"));
    }

    @Test
    public void test2() {
        Tutorial t = new Tutorial();
        Assert.assertEquals(true, t.canBalance(new int[]{1,1,1,2,1}));
        Assert.assertEquals(false, t.canBalance(new int[]{2,1,1,2,1}));
        Assert.assertEquals(true, t.canBalance(new int[]{10,10}));
    }
}
