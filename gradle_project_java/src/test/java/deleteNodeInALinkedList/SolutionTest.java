package deleteNodeInALinkedList;

import DeleteNodeInALinkedList.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        ListNode verify = new ListNode(4);
        verify.next = new ListNode(5);
        verify.next.next = new ListNode(9);

        ListNode actual = new ListNode(4);
        ListNode delete = new ListNode(1);
        actual.next = new ListNode(5);
        actual.next.next = delete;
        actual.next.next.next = new ListNode(9);
        s.deleteNode(delete);
        while (verify != null) {
            Assert.assertEquals(verify.val, actual.val);
            verify = verify.next;
            actual = actual.next;
        }
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        ListNode verify = new ListNode(4);
        verify.next = new ListNode(1);
        verify.next.next = new ListNode(9);

        ListNode actual = new ListNode(4);
        ListNode delete = new ListNode(5);
        actual.next = delete;
        actual.next.next = new ListNode(1);
        actual.next.next.next = new ListNode(9);
        s.deleteNode(delete);
        while (verify != null) {
            Assert.assertEquals(verify.val, actual.val);
            verify = verify.next;
            actual = actual.next;
        }
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        ListNode verify = new ListNode(1);
        verify.next = new ListNode(2);
        verify.next.next = new ListNode(4);

        ListNode actual = new ListNode(1);
        ListNode delete = new ListNode(3);
        actual.next = new ListNode(2);
        actual.next.next = delete;
        actual.next.next.next = new ListNode(4);
        s.deleteNode(delete);
        while (verify != null) {
            Assert.assertEquals(verify.val, actual.val);
            verify = verify.next;
            actual = actual.next;
        }
    }

    @Test
    public void test4() {
        Solution s = new Solution();
        ListNode verify = new ListNode(1);

        ListNode delete = new ListNode(0);
        ListNode actual = delete;
        actual.next = new ListNode(1);
        s.deleteNode(delete);
        while (verify != null) {
            Assert.assertEquals(verify.val, actual.val);
            verify = verify.next;
            actual = actual.next;
        }
    }

    @Test
    public void test5() {
        Solution s = new Solution();
        ListNode verify = new ListNode(5);
        verify.next = new ListNode(-99);

        ListNode delete = new ListNode(-3);
        ListNode actual = delete;
        actual.next = new ListNode(5);
        actual.next.next = new ListNode(-99);
        s.deleteNode(delete);
        while (verify != null) {
            Assert.assertEquals(verify.val, actual.val);
            verify = verify.next;
            actual = actual.next;
        }
    }
}
