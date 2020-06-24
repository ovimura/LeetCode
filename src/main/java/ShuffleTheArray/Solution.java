package ShuffleTheArray;

public class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        int i =0;
        for(int j=0; j<2*n-1; j+=2) {
                result[j] = nums[i];
                result[j+1] = nums[n+i];
                i++;
        }
        return result;
    }
}
