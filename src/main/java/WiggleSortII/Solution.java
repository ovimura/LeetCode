package WiggleSortII;

import java.util.Arrays;

public class Solution {
    public void wiggleSort0(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return;
        }

        Arrays.sort(nums);
        int n = nums.length;

        int[] temp = new int[n];
        int left = (n - 1) / 2;
        int right = n - 1;

        for (int i = 0; i < n; i++) {
            if ((i & 1) == 0) {
                temp[i] = nums[left];
                left--;
            } else {
                temp[i] = nums[right];
                right--;
            }
        }

        for(int i=0; i<n; i++) {
            nums[i] = temp[i];
        }

//        System.arraycopy(temp, 0, nums, 0, n);
    }

    public void wiggleSort(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return;
        }
        Arrays.sort(nums);
        int n = nums.length;
        int[] temp = new int[n];
        int l = (n - 1) / 2;
        int r = n - 1;
        for (int i = 0; i < n; i++) {
            if ((i & 1) == 0) {
                temp[i] = nums[l];
                l--;
            } else {
                temp[i] = nums[r];
                r--;
            }
        }
        for(int i=0; i<n; i++) {
            nums[i] = temp[i];
        }
    }

    public void wiggleSort1(int[] nums) {
        int median = findKthLargest(nums, (nums.length + 1) / 2);
        int n = nums.length;
        int left = 0, i = 0, right = n - 1;
        while (i <= right) {
            if (nums[(1 + 2*i) % (n | 1)] > median) {
                swap(nums, (1 + 2*left++) % (n | 1), (1 + 2*i++) % (n | 1));
            }
            else if (nums[(1 + 2*i) % (n | 1)] < median) {
                swap(nums, (1 + 2*right--) % (n | 1), (1 + 2*i) % (n | 1));
            }
            else {
                i++;
            }
        }
    }

    private int findKthLargest(int[] nums, int k) {
        k = nums.length - k;
        int lo = 0;
        int hi = nums.length - 1;
        while (lo < hi) {
            final int j = partition(nums, lo, hi);
            if(j < k) {
                lo = j + 1;
            } else if (j > k) {
                hi = j - 1;
            } else {
                break;
            }
        }
        return nums[k];
    }

    private int partition(int[] nums, int left, int right) {

        int i = left;
        int j = right + 1;
        while(true) {
            while(i < right && nums[++i] < nums[left]);
            while(j > left && nums[left] < nums[--j]);
            if(i >= j) {
                break;
            }
            swap(nums, i, j);
        }
        swap(nums, left, j);
        return j;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
