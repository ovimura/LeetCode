package SumOfAllSubsetXORTotals;

public class Solution {
    private int sum = 0;
    public int subsetXORSum(int[] nums) {
        backtracking(nums, 0, 0);
       return sum;
    }

    void backtracking(int [] nums, int z, int cur) {
        if(z == nums.length) return;
        for(int i=z; i<nums.length; i++) {
            cur ^= nums[i];
            sum +=  cur;
            backtracking(nums, i+1, cur);
            cur ^= nums[i];
        }
    }

    public int subsetXORSum1(int [] nums) {
        int ans = 0, n = nums.length, tot = (1 << n);
        for (int i = 0; i < tot; ++i) {
            int xorsum = 0;
            for (int j = 0; j < n; ++j) if (((i >> j) & 1) != 0) xorsum ^= nums[j];
            ans += xorsum;
        }
        return ans;
    }

    private int total = 0;

    public int subsetXORSum2(int [] nums) {
        traverse(nums, 0, 0);
        return total;
    }

    public void traverse(int[] nums, int idx, int xor) {
        if(idx == nums.length) {
            total += xor;
            return;
        }
        traverse(nums, idx+1, xor^nums[idx]);
        traverse(nums, idx+1, xor);
    }


}
