package SearchInsertPosition;

public class Solution {
    public int searchInsert(int[] nums, int target) {
        if(target<nums[0])
            return 0;
        if(target>nums[nums.length-1])
            return nums.length;
        int mid = nums.length/2;
        if(target == nums[mid])
            return mid;
        else if(target < nums[mid]) {
            int []l = new int[mid];
            for(int i=0; i<l.length; i++)
                l[i] = nums[i];
            return searchInsert(l, target);
        } else {//if(target > nums[mid] && target <= nums[nums.length-1]) {
            int len = nums.length - mid;
            int []r = new int[len];
            for(int j=mid; j<nums.length; j++)
                r[j-mid] = nums[j];
            return mid + searchInsert(r, target);
        }
        //return -1;
    }
}
