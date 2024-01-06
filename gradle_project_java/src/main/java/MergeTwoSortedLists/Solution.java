package MergeTwoSortedLists;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode temp = null;
        ListNode head = null;
        if(l1 != null) {
            temp = new ListNode(l1.val);
            head = temp;
            l1 = l1.next;
            while (l1 != null) {
                temp.next = new ListNode(l1.val);
                temp = temp.next;
                l1 = l1.next;
            }
        }
        if(l2 != null) {
            temp = head;
            while(l2 != null) {
                if(temp != null && l2.val <= temp.val) {
                    ListNode ln = new ListNode(l2.val);
                    ln.next = temp;
                    temp = ln;
                    if(temp.val<=head.val)
                        head = temp;
                } else if (temp != null) {
                    ListNode prev = temp;
                    while(temp != null && l2.val > temp.val) {
                        prev = temp;
                        temp = temp.next;
                    }
                    ListNode between = new ListNode(l2.val);
                    between.next = prev.next;
                    prev.next = between;
                    temp = head;
                } else if( temp == null) {
                    temp = new ListNode(l2.val);
                    head = temp;
                    l2 = l2.next;
                    while (l2 != null) {
                        temp.next = new ListNode(l2.val);
                        temp = temp.next;
                        l2 = l2.next;
                    }
                    return head;
                }
                l2 = l2.next;
            }
        }
        return head;
    }
}
