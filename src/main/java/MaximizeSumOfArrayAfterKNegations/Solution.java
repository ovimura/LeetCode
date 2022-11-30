package MaximizeSumOfArrayAfterKNegations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        List<Integer> lessThanZero = new ArrayList<>();
        int lastNegIdx = -1;
        if(nums[0] == 0) {
            k = 0;
            int sum = 0;
            for (int x : nums) {
                sum += x;
            }
            return sum;
        }
        for(int i=0; i<nums.length; i++) {
            if(nums[i]<0 && k != 0) {
                lessThanZero.add(nums[i]*(-1));
                k--;
                lastNegIdx = i;
            } else if(k == 0)
                break;
        }
        if(k>0 && lastNegIdx != -1) {
            if(lastNegIdx+1 < nums.length && nums[lastNegIdx+1] == 0) {
                k = 0;
                int sum = 0;
                for(int i: lessThanZero) {
                    sum += i;
                }
                for(int j=lastNegIdx+1; j<nums.length; j++) {
                    sum += nums[j];
                }
                return sum;
            } else if(lastNegIdx+1 < nums.length && nums[lastNegIdx+1] != 0) {
                for(int i=lastNegIdx+1; i<nums.length; i++) {
                    lessThanZero.add(nums[i]);
                }
                Collections.sort(lessThanZero);
                int s = 0;
                for (Integer integer : lessThanZero) {
                    if (k > 0 && k%2 != 0) {
                        s += -integer;
                        k--;
                    } else
                        s += integer;
                }
                return s;
            } else if (lastNegIdx+1 == nums.length){
                Collections.sort(lessThanZero);
                int sum = 0;
                if(k%2 == 0) {
                    for(int i: lessThanZero)
                        sum += i;
                    return sum;
                } else {
                    sum += -lessThanZero.remove(0);
                    for(int i: lessThanZero)
                        sum += i;
                    return sum;
                }
            }
        } else if (k == 0) {
            int sum = 0;
            for(int i: lessThanZero) {
                sum += i;
            }
            for(int j=lastNegIdx+1; j<nums.length; j++) {
                sum += nums[j];
            }
            return sum;
        } else if (k>0) {
            if(k%2 == 0) {
                int sum = 0;
                for(int n: nums) {
                    sum += n;
                }
                return sum;
            } else {
                nums[0] *= -1;
                int sum = 0;
                for(int n: nums) {
                    sum += n;
                }
                return sum;
            }
        }
        return 0;
    }
}
