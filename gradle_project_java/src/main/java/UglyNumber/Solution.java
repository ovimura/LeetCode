package UglyNumber;

public class Solution {
    public boolean isUgly(int n) {
        int i = 2;
        int j = 0;
        if(n == 1)
            return true;
        while(n>1 && i == 2) {
            if(n%2 == 0) {
                n = n/2;
                j++;
            } else if(n%3 == 0) {
                n = n/3;
                j++;
            } else if(n%5 == 0) {
                n = n/5;
                j++;
            } else
                i++;
        }
        if(i==2 && j>0)
            return true;
        return false;
    }
}
