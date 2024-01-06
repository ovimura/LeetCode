package ValidPerfectSquare;

public class Solution {
    public boolean isPerfectSquare(int num) {
        long l = 0;
        while(num>=l) {
            if((l*l) == num)
                return true;
            else if ((l*l) > num) {
                return false;
            }
            l++;
        }
        return true;
    }
}
