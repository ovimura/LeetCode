package designHashSet;

import DesignHashSet.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution.MyHashSet s = new Solution.MyHashSet();
        s.add(1);
        s.add(2);
        Assert.assertEquals(true, s.contains(1));
        Assert.assertEquals(false, s.contains(3));
        s.add(2);
        Assert.assertEquals(true, s.contains(2));
        s.remove(2);
        Assert.assertEquals(false, s.contains(2));
    }
}
