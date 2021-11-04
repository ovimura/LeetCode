package NumberOf1Bits;

public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int mask = 1;
        int count = 0;
        int len = 0;
        while(len<32) {
            int t = n&mask;
            if(t != 0)
                count++;
            len++;
            mask = mask << 1;
        }
        return count;
    }
}