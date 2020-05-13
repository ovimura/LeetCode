package CountNegativeNumbersInASortedMatrix;

public class Solution {
    int count;
    public int countNegatives(int[][] grid) {
        for(int i=0; i<grid.length; i++) {
            count += binarySearch(grid[i], 0, grid[i].length-1, val);
        }
        return count;
    }
    int val;
    public int binarySearch(int[] nums, int l, int r, int v) {
        if(l>r)
            return v;
        int mid = (r+l)/2;
        if(0> nums[mid])
            return 1;
        else if(0>nums[mid])
            return 1+binarySearch(nums, mid+1, r, v);
        else
            return binarySearch(nums, l, mid-1, v);
    }
}
