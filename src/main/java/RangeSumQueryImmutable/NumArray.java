package RangeSumQueryImmutable;

public class NumArray {
    int[] ns;
    public NumArray(int[] nums) {
        ns = nums;
    }

    public int sumRange(int left, int right) {
        int sum = 0;
        for(int i=left; i<=right; i++) {
            sum += ns[i];
        }
        return sum;
    }
}
