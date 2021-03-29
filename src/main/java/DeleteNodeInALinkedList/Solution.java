package DeleteNodeInALinkedList;

public class Solution {
    public void deleteNode(ListNode node) {
        ListNode temp = node;
        ListNode prev = temp;
        while(temp.next != null) {
            temp.val = temp.next.val;
            prev = temp;
            temp = temp.next;
        }
        prev.next = null;
    }
}
