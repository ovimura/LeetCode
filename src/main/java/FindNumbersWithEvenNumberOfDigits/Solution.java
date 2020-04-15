package FindNumbersWithEvenNumberOfDigits;

public class Solution {
    public int findNumbers(int[] nums) {
        int digits = 1;
        int count = 0;
        for(int i=0; i<nums.length; i++) {
            int quotient = nums[i]/10;
            while (quotient > 0) {
                digits++;
                quotient = quotient/10;
            }
            if (digits % 2 == 0)
                count++;
            digits = 1;
        }
        return count;
    }
}
