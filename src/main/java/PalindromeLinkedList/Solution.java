package PalindromeLinkedList;

public class Solution {
    public boolean isPalindrome(ListNode head) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        while(head != null) {
            sb1.append(head.val);
            sb2.append(head.val);
            head = head.next;
        }
        if(sb1.toString().equals(sb2.reverse().toString()))
            return true;
        return false;
    }
}
