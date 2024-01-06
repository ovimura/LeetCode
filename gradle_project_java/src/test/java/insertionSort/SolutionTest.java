package insertionSort;

import org.junit.Assert;
import org.junit.Test;
import InsertionSort.Solution;
import InsertionSort.ListNode;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        ListNode head = new ListNode();
        head.val = 4;
        head.next = new ListNode();
        head.next.val = 2;
        head.next.next = new ListNode();
        head.next.next.val = 1;
        head.next.next.next = new ListNode();
        head.next.next.next.val = 3;
        head.next.next.next.next = null;
        ListNode ln = head;
        while (ln != null) {
            System.out.print(ln.val);
            ln = ln.next;
        }
        System.out.println();
        ln = s.insertionSortList(head);
        while (ln != null) {
            System.out.print(ln.val);
            ln = ln.next;
        }
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        ListNode head = new ListNode();
        head.val = 4;
        head.next = new ListNode();
        head.next.val = 2;
        head.next.next = new ListNode();
        head.next.next.val = 1;
        head.next.next.next = new ListNode();
        head.next.next.next.val = 3;
        head.next.next.next.next = null;
        ListNode ln = head;
        while (ln != null) {
            System.out.print(ln.val);
            ln = ln.next;
        }
        System.out.println();
        ln = s.insertionSortList1(head);
        while (ln != null) {
            System.out.print(ln.val);
            ln = ln.next;
        }
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        ListNode head = new ListNode();
        head.val = 4;
        head.next = new ListNode();
        head.next.val = 2;
        head.next.next = new ListNode();
        head.next.next.val = 1;
        head.next.next.next = new ListNode();
        head.next.next.next.val = 3;
        head.next.next.next.next = null;
        ListNode ln = head;
        while (ln != null) {
            System.out.print(ln.val);
            ln = ln.next;
        }
        System.out.println();
        ln = s.insertionSortLinkedList(head);
        while (ln != null) {
            System.out.print(ln.val);
            ln = ln.next;
        }
    }
}
