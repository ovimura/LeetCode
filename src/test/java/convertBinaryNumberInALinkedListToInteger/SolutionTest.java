package convertBinaryNumberInALinkedListToInteger;

import ConvertBinaryNumberInALinkedListToInteger.ListNode;
import org.junit.Assert;
import org.junit.Test;
import ConvertBinaryNumberInALinkedListToInteger.Solution;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        ListNode head = new ListNode(1, new ListNode(0, new ListNode(1)));
        Assert.assertEquals(5, s.getDecimalValue(head));
    }

    @Test
    public void test2() {
        Solution s = new Solution(); // 1,0,0,1,0,0,1,1,1,0,0,0,0,0,0
        ListNode head = new ListNode(1, new ListNode(0, new ListNode(0, new ListNode(1, new ListNode(0, new ListNode(0,
                new ListNode(1, new ListNode(1, new ListNode(1, new ListNode(0, new ListNode(0, new ListNode(0,
                        new ListNode(0, new ListNode(0, new ListNode(0)))))))))))))));
        Assert.assertEquals(18880, s.getDecimalValue(head));
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        ListNode head = new ListNode(0);
        Assert.assertEquals(0, s.getDecimalValue(head));
    }

    @Test
    public void test4() {
        Solution s = new Solution();
        ListNode head = new ListNode(1);
        Assert.assertEquals(1, s.getDecimalValue(head));
    }

    @Test
    public void test5() {
        Solution s = new Solution();
        ListNode head = new ListNode(0, new ListNode(0));
        Assert.assertEquals(0, s.getDecimalValue(head));
    }

}
