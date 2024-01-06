package PowerOfFour;

public class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==1)
            return true;
        while(n> 4) {
            if(n % 4 != 0)
                return false;
            n = n/4;
        }
        if(n != 4)
            return false;
        return true;
    }
}
