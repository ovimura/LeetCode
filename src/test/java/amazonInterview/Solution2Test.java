package amazonInterview;

import AmazonInterview.Solution2;
import org.junit.Test;

public class Solution2Test {
    @Test
    public void test1() {
        Solution2 s = new Solution2();
        int[] arr = new int[]{2,3, 4, 5, 6};
        int gcd = s.generalizedGCD(5, arr);
        System.out.println(gcd);
    }

    @Test
    public void test2() {
        Solution2 s = new Solution2();
        int[] arr = new int[]{2,4,6,8,10};
        int gcd = s.generalizedGCD(5, arr);
        System.out.println(gcd);
    }

}
