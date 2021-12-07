package implementStackUsingQueues;

import ImplementStackUsingQueues.*;

import org.junit.Assert;
import org.junit.Test;

public class MyStackTest {
    @Test
    public void test1() {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.pop();
        //myStack.top();
        Assert.assertEquals(true, myStack.empty());
    }
}
