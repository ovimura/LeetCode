package ConvertBinaryNumberInALinkedListToInteger;

public class Solution {
    public int getDecimalValue(ListNode head) {
        int val = 0;
        int len = 0;
        ListNode listNode = head;
        while(listNode != null) {
            len++;
            listNode = listNode.next;
        }
        int i=1;
        while (head != null) {
            val += head.val*Math.pow(2, len-i);
            i++;
            head = head.next;
        }
        return val;
    }
}
