package lFUCache;

import LFUCache.*;
import org.junit.Assert;
import org.junit.Test;

public class LFUCacheTest {
    @Test
    public void test1() {
        LFUCache obj = new LFUCache(10);
        int param_1 = obj.get(1);
        obj.put(1,111);
        Assert.assertEquals(-1, param_1);
        Assert.assertEquals(111, obj.get(1));
    }
}
