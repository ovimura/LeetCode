package SubtractTheProductAndSumOfDigitsOfAnInteger;

import java.util.ArrayList;

public class Solution {
    public int subtractProductAndSum(int n) {
        ArrayList<Integer> digits = new ArrayList<>();
        int tmp = n;
        int m = 10;
        int t = 0;
        int idx =0;
        while(n % m != n) {
            int val = (tmp % m);
            if(val/(m/10) >=1 )
                digits.add(val/(m/10));
            else {
                digits.add(val);
            }
            if(m >= 10)
                t = digits.get(idx)*(m/10);
            m = m*10;
            tmp = tmp - (t);
            idx++;
        }
        digits.add(tmp/(m/10));
        int prod = 1;
        for(int d: digits) {
            prod *= d;
        }
        int sum = 0;
        for(int d: digits) {
            sum += d;
        }
        return prod-sum;
    }

    public int subtractProductAndSum1(int n) {
        int prod = 1;
        int sum = 0;
        while(n != 0) {
            sum += n%10;
            prod *= n%10;
            n /= 10;
        }
        return prod-sum;
    }
}
