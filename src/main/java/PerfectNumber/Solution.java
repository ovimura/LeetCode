package PerfectNumber;

public class Solution {
    public boolean checkPerfectNumber(int num) {
        if(num==1) return false;
        int i=2;
        int k=0;
        while (i*i<num) {
            if(num%i == 0) {
                k += (i+(num/i));
            }
            i++;
        }
        return k+1==num;
    }

}
