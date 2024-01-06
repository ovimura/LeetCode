package PowerOfThree;

public class Solution {
    public boolean isPowerOfThree(int n) {
        for(int i=0; i<=Integer.MAX_VALUE; i++) {
            if(n==Math.pow(3,i))
                return true;
            else if(n<Math.pow(3,i))
                return false;
        }
        return false;
    }

    public boolean isPowerOf3(int n) {
        if(n==0)
            return false;
        while(n%3 == 0) {
            n=n/3;
        }
        return n==1;
    }
}
