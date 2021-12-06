package reverseLinkedList;

import ReverseLinkedList.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        ListNode root = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode expected = new ListNode(5, new ListNode(4, new ListNode(3, new ListNode(2, new ListNode(1)))));
        ListNode rev = s.reverseList(root);
        while(expected != null && rev != null) {
            System.out.println(rev.val);
            Assert.assertEquals(expected.val, rev.val);
            rev = rev.next;
            expected = expected.next;
        }
    }
}
