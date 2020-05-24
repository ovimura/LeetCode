package AmazonInterview;

public class Solution2 {
    public int generalizedGCD(int num, int[]arr) {
            class GCD {
            int gcd(int n1, int n2) {
                if (n1 == 0)
                    return n2;

                return gcd(n2 % n1, n1);
            }
        }
        GCD gcd = new GCD();
        int r = arr[0];
        for(int i=1; i<num; i++) {
            r = gcd.gcd(arr[i], r);
            if(r ==1)
                return 1;
        }
        return r;
    }
}
