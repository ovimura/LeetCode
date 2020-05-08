public Solution {
    public int totalHammingDistance(int[] nums) {
        int n = nums.length;
        int total = 0;
        for (int i = 0; i < 32; ++i) {
            int count = 0;
            for (int val : nums) {
                val = (val >> i) & 1;
                count += val & 1;
            }
            total += count * (n - count);
        }
        return total;
    }
}