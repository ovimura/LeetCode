package mergeKSortedLists;

import org.junit.Assert;
import org.junit.Test;

import MergeKSortedLists.*;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        ListNode[] ls = new ListNode[3];
        ls[0] = new ListNode(1, new ListNode(4, new ListNode(5)));
        ls[1] = new ListNode(1, new ListNode(3, new ListNode(4)));
        ls[2] = new ListNode(2, new ListNode(6));
        ListNode rs = s.mergeKLists(ls);
        String result = "";
        while(rs != null) {
            result += rs.val;
            rs = rs.next;
        }
        Assert.assertEquals("11234456",result);
    }
}
