package middleOfTheLinkedList;

import MiddleOfTheLinkedList.*;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        ListNode ln = s.middleNode(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))));
        ListNode result = new ListNode(3, new ListNode(4, new ListNode(5)));
        while(ln != null) {
            if(ln.val != result.val)
                throw new AssertionError("test failed!");
            result = result.next;
            ln = ln.next;
        }
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        ListNode ln = s.middleNode(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6)))))));
        ListNode result = new ListNode(4, new ListNode(5, new ListNode(6)));
        while(ln != null) {
            if(ln.val != result.val)
                throw new AssertionError("test failed!");
            result = result.next;
            ln = ln.next;
        }
    }
}
