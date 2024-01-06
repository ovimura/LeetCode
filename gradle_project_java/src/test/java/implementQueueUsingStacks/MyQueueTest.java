package implementQueueUsingStacks;

import ImplementQueueUsingStacks.MyQueue;

import org.junit.Assert;
import org.junit.Test;

public class MyQueueTest {
    @Test
    public void test1() {
        MyQueue q = new MyQueue();
        q.push(1);
        Assert.assertEquals(1, q.peek());
        Assert.assertEquals(1, q.pop());
        Assert.assertTrue(q.empty());
    }
}
