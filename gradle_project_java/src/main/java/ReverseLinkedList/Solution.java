package ReverseLinkedList;

public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode node = head;
        ListNode rs = null;
        while(node != null) {
            ListNode temp = new ListNode(node.val);
            temp.next = rs;
            rs = temp;
            node = node.next;
        }
        return rs;
    }
}
