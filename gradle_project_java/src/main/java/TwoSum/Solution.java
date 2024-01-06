package TwoSum;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int sum;
        int a = 0, b = 0;
        for(int i=0; i<nums.length; i++) {
            for (int j=i+1; j<nums.length; j++) {
                sum = nums[i]+nums[j];
                if(sum == target) {
                    a = i;
                    b = j;
                    break;
                }
            }
        }
        return new int[]{a, b};
    }
    public int[] twoSum1(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            map.put(nums[i], i);
        }
        for(int j=0; j<nums.length; j++) {
            int complement = target - nums[j];
            if(map.containsKey(complement) && map.get(complement) != j) {
                return new int[] {j,map.get(complement)};
            }
        }
        throw new IllegalArgumentException("There are no two sum");
    }
    public int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int j=0; j<nums.length; j++) {
            int complement = target - nums[j];
            if(map.containsKey(complement) && map.get(complement) != j) {
                return new int[] {map.get(complement),j};
            }
            map.put(nums[j], j);
        }
        throw new IllegalArgumentException("There are no two sum");
    }
}
