package removeDuplicatesFromSortedList;

import RemoveDuplicatesFromSortedList.*;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SolutionTest {

    @Test
    public void test1() {
        ListNode n = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3)))));
        Solution s = new Solution();
        ListNode r = s.deleteDuplicates(n);
        List<Integer> l = new ArrayList<>();
        while(r != null) {
            l.add(r.val);
            r = r.next;
        }
        Integer[] ii = l.toArray(new Integer[]{});
        Assert.assertArrayEquals(new Integer[]{1, 2, 3}, ii);
    }
}
