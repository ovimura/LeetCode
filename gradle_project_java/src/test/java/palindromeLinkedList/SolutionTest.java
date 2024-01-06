package palindromeLinkedList;

import PalindromeLinkedList.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals(true, s.isPalindrome(new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1))))));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertEquals(false, s.isPalindrome(new ListNode(1, new ListNode(2))));
    }
}
