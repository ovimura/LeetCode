package TwoSumIIInputArrayIsSorted;

public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] rs = new int[2];
        for(int i=0; i<numbers.length-1; i++) {
            for(int j=i+1; j<numbers.length; j++) {
                if((numbers[i]+numbers[j]) == target) {
                    rs[0] = i+1;
                    rs[1] = j+1;
                    return rs;
                }
            }
        }
        return null;
    }

    public int[] twoSum1(int[] numbers, int target) {
        int n = numbers.length;
        int left = 0;
        int right = n-1;

        while(left < right){
            int sum = numbers[left] + numbers[right];
            if (sum == target) return new int[]{left+1, right+1};

            if (sum < target ){
                left++;
            } else {
                right--;
            }
        }

        return new int[0];
    }
}
