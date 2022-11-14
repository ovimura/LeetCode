package designHashMap;

import DesignHashMap.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution.MyHashMap s = new Solution.MyHashMap();
        s.put(1,1);
        s.put(2,2);
        Assert.assertEquals(1, s.get(1));
        Assert.assertEquals(-1, s.get(3));
        s.put(2,1);
        Assert.assertEquals(1, s.get(2));
        s.remove(2);
        Assert.assertEquals(-1, s.get(2));
    }
}
