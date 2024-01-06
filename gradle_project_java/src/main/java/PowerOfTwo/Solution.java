package PowerOfTwo;

public class Solution {
    public boolean isPowerOfTwo(int n) {
        for(int i=0; i<Integer.MAX_VALUE; i++) {
            double p = Math.pow(2, i);
            if (p == n)
                return true;
            else if (p>n)
                return false;
        }
        return false;
    }
}
