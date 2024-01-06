package mergeTwoSortedLists;

import MergeTwoSortedLists.*;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        Solution s = new Solution();
        ListNode ln = s.mergeTwoLists(l1, l2);
        while(ln != null) {
            // System.out.print(ln.val + " ");
            ln = ln.next;
        }
    }

    @Test
    public void test2() {
        ListNode l1 = new ListNode();
        ListNode l2 = new ListNode();
        Solution s = new Solution();
        ListNode ln = s.mergeTwoLists(null, l2);
        while(ln != null) {
            // System.out.print(ln.val + " ");
            ln = ln.next;
        }
    }
}
