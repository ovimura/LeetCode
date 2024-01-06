package RemoveLinkedListElements;

public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode node = null;
        ListNode newHead = null;
        if(head != null) {
            while(head != null) {
                if(head.val != val) {
                    ListNode temp = new ListNode(head.val);
                    if(node != null) {
                        node.next = temp;
                        node = node.next;
                    } else {
                        node = temp;
                        newHead = node;
                    }
                }
                head = head.next;
            }
        }
        return newHead;
    }
}
