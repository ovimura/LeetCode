package TotalHammingDistance;

public class Solution {

    public int HammingDistance(int x, int y)
    {
        int n = x^y;
        int countDiffBits = 0;
        while (n > 0) {
            countDiffBits += n & 1;
            n >>= 1;
        }
        return countDiffBits;
    }

    public int totalHammingDistance0(int[] nums) {
        int total = 0;
        for(int i=0; i<nums.length; i++) {
            for(int j=i+1; j<nums.length; j++) {
                total += HammingDistance(nums[i], nums[j]);
            }
        }
        return total;
    }

    public int totalHammingDistance(int[] nums) {
        int n = nums.length;
        int total = 0;
        for (int i = 0; i < 32; ++i) {
            int count = 0;
            for (int val : nums) {
                val = (val >> i) & 1;
                count += val & 1;
            }
            total += count * (n - count);
        }
        return total;
    }
}
