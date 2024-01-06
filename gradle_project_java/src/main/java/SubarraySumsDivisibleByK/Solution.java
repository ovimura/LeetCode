package SubarraySumsDivisibleByK;

public class Solution {
    public int subarraysDivByK_bruteforce(int[] nums, int k) {
        int [] temp = new int[nums.length+1];
        for(int i=0; i<nums.length; i++) {
            temp[i+1] += temp[i] + nums[i];
        }
        int count=0;
        for(int i=0; i<temp.length; i++) {
            for(int j=i+1; j<temp.length; j++) {
                if((temp[j]-temp[i]) % k == 0)
                    count++;
            }
        }
        return count;
    }

    //O(N)time O(min(N,K))space
    public int subarraysDivByK(int[] A, int K) {
        int[] map = new int[K];
        map[0] = 1;
        int count = 0, sum = 0;
        for (int a : A) {
            sum = (sum + a) % K;
            if (sum < 0) sum += K;
            count += map[sum];
            map[sum]++;
        }
        return count;
    }
}
