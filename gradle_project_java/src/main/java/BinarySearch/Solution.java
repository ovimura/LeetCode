package BinarySearch;

public class Solution {
    public int search(int[] nums, int target) {
        if(nums.length == 0 )
            return -1;
        return binarySearch(nums, 0, nums.length-1, target);
    }

    public int binarySearch(int[] nums, int l, int r, int target) {
        if(l>r)
            return -1;
        int mid = (r+l)/2;
        if(target == nums[mid])
            return mid;
        else if(target>nums[mid])
            return binarySearch(nums, mid+1, r, target);
        else
            return binarySearch(nums, l, mid-1, target);
    }
}
