package linkedListCycle;

import LinkedListCycle.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        ListNode cir = new ListNode(2);
        ListNode t = new ListNode(0).next = new ListNode(-4).next = cir;
        cir.next = t;
        ListNode head = new ListNode(3).next = cir;
        Assert.assertEquals(true, s.hasCycle(head));
    }
}
