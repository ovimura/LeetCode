package MaximumAverageSubarrayI;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public double findMaxAverage(int[] nums, int k) {
        double sum=0;
        for(int i=0;i<k;i++)
            sum+=nums[i];
        double res=sum;
        for(int i=k;i<nums.length;i++){
            sum+=nums[i]-nums[i-k];
            res=Math.max(res,sum);
        }
        return res/k;
    }

    public double findMaxAverage_slow(int[] nums, int k) {
        double r = -Double.MAX_VALUE;
        for(int i=0; i<=nums.length-k; i++) {
            double sum = 0.0;
            for(int j=i; j<i+k; j++) {
                sum += nums[j];
            }
            if((sum/k)>r)
                r = sum/k;
        }
        return r;
    }
}
