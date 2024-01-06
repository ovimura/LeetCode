package designAnOrderedStream;

import DesignAnOrderedStream.*;

import org.junit.Assert;
import org.junit.Test;

public class OrderedStreamTest {
    @Test
    public void test1() {
        OrderedStream o = new OrderedStream(5);
        Assert.assertArrayEquals(new String[]{}, o.insert(3, "ccccc").toArray(new String[]{}));
        Assert.assertArrayEquals(new String[]{"aaaaa"}, o.insert(1, "aaaaa").toArray(new String[]{}));
        Assert.assertArrayEquals(new String[]{"bbbbb","ccccc"}, o.insert(2, "bbbbb").toArray(new String[]{}));
        Assert.assertArrayEquals(new String[]{}, o.insert(5, "eeeee").toArray(new String[]{}));
        Assert.assertArrayEquals(new String[]{"ddddd","eeeee"}, o.insert(4, "ddddd").toArray(new String[]{}));
    }
}
