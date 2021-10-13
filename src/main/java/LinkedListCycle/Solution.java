package LinkedListCycle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public boolean hasCycle(ListNode head) {
        Map<Integer, List<ListNode>> map = new HashMap<>();
        ListNode temp = head;
        while(temp != null && ((!map.containsKey(temp.val)) || !map.get(temp.val).contains(temp))) {
            if(!map.containsKey(temp.val)) {
                List<ListNode> ln = new ArrayList<>();
                ln.add(temp);
                map.put(temp.val, ln);
            } else {
                List<ListNode> ln = map.get(temp.val);
                ln.add(temp);
                map.put(temp.val, ln);
            }
            temp = temp.next;
        }
        if(temp != null)
            return true;
        else return false;
    }
}
