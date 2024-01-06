package RemoveDuplicatesFromSortedList;

import RemoveDuplicatesFromSortedList.ListNode;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        SortedSet<Integer> ss = new TreeSet<Integer>();
        while(head != null) {
            ss.add(head.val);
            head = head.next;
        }
        ListNode r = null;
        ListNode root = null;
        int a = 0;
        for (Integer i: ss) {
            if (a == 0) {
                root = new ListNode(i);
                r = root;
                a++;
            } else {
                root.next = new ListNode(i);
                root = root.next;
                a++;
            }
        }
        return r;
    }
}
