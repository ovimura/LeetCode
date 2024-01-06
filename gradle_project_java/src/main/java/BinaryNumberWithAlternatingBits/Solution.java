package BinaryNumberWithAlternatingBits;

public class Solution {
    public boolean hasAlternatingBits(int n) {
        boolean f = false;
        int count = 0;
        while(n>0) {
            if(count == 0 && 1 == (n & 1)) {
                f = true;
                count++;
            } else if(count == 0){
                count++;
            }
            if(f) {
                if((count % 2) == 0 && 1 == (n & 1)) {
                    return false;
                } else if((count % 2) == 1 && 0 == (n & 1)) {
                    return false;
                }
            } else {
                if((count % 2) == 0 && 0 == (n & 1)) {
                    return false;
                } else if((count % 2) == 1 && 1 == (n & 1)) {
                    return false;
                }
            }
            count++;
            n /= 2;
        }
        return true;
    }
}
