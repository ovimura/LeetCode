package CountNegativeNumbersInASortedMatrix;

public class Solution {
    public int countNegatives(int[][] grid) {
        int count=0;
        for(int i=0; i<grid.length; i++) {
            count += (grid[i].length-1)-binarySearch(grid[i], 0,grid[i].length-1);
        }
        return count;
    }

    public int binarySearch(int[] nums, int l, int r) {
        while (r>=l) {
            int mid = (r+l)/2;
            if(nums[mid]<0)
                r = mid-1;
            else
                l = mid+1;
        }
        return r;
    }
}
