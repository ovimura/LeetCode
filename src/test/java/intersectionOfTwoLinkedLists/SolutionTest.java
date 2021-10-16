package intersectionOfTwoLinkedLists;

import IntersectionOfTwoLinkedLists.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        ListNode headA = new ListNode(4);
        headA.next = new ListNode(1);
        ListNode headB = new ListNode(5);
        headB.next = new ListNode(6);
        headB.next.next = new ListNode(1);

        headA.next.next = new ListNode(8);
        headA.next.next.next = new ListNode(4);
        headA.next.next.next.next = new ListNode(5);
        headB.next.next.next = headA.next.next;

        Assert.assertEquals(headA.next.next, s.getIntersectionNode(headA, headB));
    }
}
