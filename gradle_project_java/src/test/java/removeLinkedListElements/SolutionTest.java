package removeLinkedListElements;

import RemoveLinkedListElements.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void test1() {
        ListNode h1 = new ListNode(1, new ListNode(2, new ListNode(6, new ListNode(3, new ListNode(
                4, new ListNode(5, new ListNode(6)))))));
        ListNode expectedList = new ListNode(1, new ListNode(2, new ListNode(3,
                new ListNode(4, new ListNode(5)))));
        Solution s = new Solution();
        ListNode h2 = s.removeElements(h1, 6);
        while(h2 != null && expectedList != null) {
            Assert.assertEquals(h2.val, expectedList.val);
            h2 = h2.next;
            expectedList = expectedList.next;
        }
    }
}
