class Solution {
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
}