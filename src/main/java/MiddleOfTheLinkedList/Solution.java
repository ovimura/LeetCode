package MiddleOfTheLinkedList;

public class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        ListNode ln = new ListNode();
        ListNode top = null;
        int len = 0;
        while(head != null) {
            len++;
            head = head.next;
        }
        int mid = 0;
        if(len % 2 == 0)
            mid = (len/2)+1;
        else
            mid = ((len-1)/2)+1;
        int i=0;
        while(temp != null) {
            if(i == mid-1) {
                ln = new ListNode(temp.val);
                top = ln;
            } else if (i > mid-1) {
                ln.next = new ListNode(temp.val);
                ln = ln.next;
            }
            i++;
            temp = temp.next;
        }
        return top;
    }
}
