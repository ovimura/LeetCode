package MergeKSortedLists;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode list = new ListNode(0);
        ListNode tmp = list;
        PriorityQueue<ListNode> q = new PriorityQueue<>(new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o1.val-o2.val;
            }
        });
        for(ListNode listNode: lists) {
            if(listNode != null)
                q.offer(listNode);
        }
        while(!q.isEmpty()) {
            ListNode n = q.poll();
            tmp.next = n;
            tmp = tmp.next;

            if(n.next != null)
                q.offer(n.next);
        }
        return list.next;
    }
}
