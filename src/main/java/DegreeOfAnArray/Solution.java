package DegreeOfAnArray;

import java.util.*;

public class Solution {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> left = new HashMap(),
                right = new HashMap(), count = new HashMap();

        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            if (left.get(x) == null) left.put(x, i);
            right.put(x, i);
            count.put(x, count.getOrDefault(x, 0) + 1);
        }

        int ans = nums.length;
        int degree = Collections.max(count.values());
        for (int x: count.keySet()) {
            if (count.get(x) == degree) {
                ans = Math.min(ans, right.get(x) - left.get(x) + 1);
            }
        }
        return ans;
    }

    public int findShortestSubArrayII(int[] nums) {
        if (nums.length == 1){
            return 1;
        }
        int max = 0;
        for (int i = 0; i<nums.length;i++){
            max=Math.max(max,nums[i]);
        }
        int min = nums.length;
        int[] count = new int[max+1];
        int[] start = new int[max+1];
        int[] end = new int[max+1];
        max = 0;
        for (int i = 0; i<nums.length;i++){
            count[nums[i]]+=1;
            if (start[nums[i]]==0){
                start[nums[i]]=i+1;
            }
            end[nums[i]]=i+1;
            max=Math.max(count[nums[i]],max);
        }
        for (int i : nums){
            if (count[i]==max){
                min=Math.min(end[i]-start[i]+1,min);
            }
        }
        return min;
    }
}
