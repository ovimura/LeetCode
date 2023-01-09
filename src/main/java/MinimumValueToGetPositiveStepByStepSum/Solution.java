package MinimumValueToGetPositiveStepByStepSum;

public class Solution {
    public int minStartValue(int[] nums) {
        int i = 1;
        while(true) {
            int sum = i;
            boolean lessThanZero = false;
            for(int n: nums) {
                sum += n;
                if(sum < 1) {
                    lessThanZero = true;
                    break;
                }
            }
            if(!lessThanZero)
                return i;
            i++;
        }
    }
}
