package InsertionSort;

import java.util.List;

public class Solution {
    public ListNode insertionSortList(ListNode head) {
        ListNode sorted=null, currh = head;
        while(currh!=null) {
            ListNode next = currh.next;
            ListNode curr = currh;
            if(sorted==null || sorted.val >= curr.val) {
                curr.next = sorted;
                sorted = curr;
            } else {
                ListNode current = sorted;
                while (current.next != null && current.next.val < curr.val) {
                    current = current.next;
                }
                curr.next = current.next;
                current.next = curr;
            }
            currh = next;
        }
        return sorted;
    }

    public ListNode _insertionSortList(ListNode head) {
        ListNode sorted=null, curr = head;
        while(curr!=null) {
            ListNode next = curr.next;
            ListNode temp = curr;
            if(sorted==null || sorted.val >= temp.val) {
                temp.next = sorted;
                sorted = temp;
            } else {
                ListNode current = sorted;
                while (current.next != null && current.next.val < temp.val) {
                    current = current.next;
                }
                temp.next = current.next;
                current.next = temp;
            }
            curr = next;
        }
        return sorted;
    }

    public ListNode insertionSortList1(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode newHead = new ListNode(head.val);
        ListNode pointer = head.next;
        while (pointer != null) {
            ListNode innerPointer = newHead;
            ListNode next = pointer.next;
            if (pointer.val <= newHead.val) {
                ListNode oldHead = newHead;
                newHead = pointer;
                newHead.next = oldHead;
            } else {
                while (innerPointer.next != null) {
                    if (pointer.val > innerPointer.val && pointer.val <= innerPointer.next.val) {
                        ListNode oldNext = innerPointer.next;
                        innerPointer.next = pointer;
                        pointer.next = oldNext;
                    }
                    innerPointer = innerPointer.next;
                }
                if (innerPointer.next == null && pointer.val > innerPointer.val) {
                    innerPointer.next = pointer;
                    pointer.next = null;
                }
            }
            pointer = next;
        }
        return newHead;
    }

    public ListNode insertionSortLinkedList(ListNode head) {
        ListNode curr = head;
        ListNode sorted_head = null;
        while (curr != null)
        {
            ListNode currNext = curr.next;
            sorted_head = sortedInsert(sorted_head,curr);
            curr = currNext;
        }
        return sorted_head;
    }

    public ListNode sortedInsert(ListNode sorted_head, ListNode new_node)
    {
        // Insertion at first position
        if(sorted_head == null || sorted_head.val >= new_node.val)
        {
            new_node.next = sorted_head;
            return new_node;
        }
    else
        {
            ListNode curr = sorted_head;
            while(curr.next != null &&
            curr.next.val < new_node.val)
            curr = curr.next;
            new_node.next = curr.next;
            curr.next = new_node;
        }
        return sorted_head;
    }
}
