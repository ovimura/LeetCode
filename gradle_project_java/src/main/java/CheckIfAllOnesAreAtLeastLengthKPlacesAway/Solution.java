package CheckIfAllOnesAreAtLeastLengthKPlacesAway;

// Reference: https://medium.com/algorithm-and-datastructure/check-if-all-1s-are-at-least-length-k-places-away-488b667b3248

public class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        boolean result = true;
        int pre = -1;// first
        int fro = 0;

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];

            if (num == 1) {
                fro = i;
                if (pre == -1) {
                    pre = i;
                } else {
                    int dist = fro - pre;
                    pre = i;
                    if (dist - 1 < k) {
                        result = false;
                        break;
                    }
                }
            }
        }

        return result;
    }
}
