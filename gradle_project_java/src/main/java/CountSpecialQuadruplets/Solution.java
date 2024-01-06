package CountSpecialQuadruplets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int countQuadruplets(int[] nums) {
        StringBuilder str;
        Set<String> q = new HashSet<>();
//        Arrays.sort(nums);
        if(nums.length == 4) {
            if(nums[0] + nums[1] + nums[2] == nums[3]) {
                return 1;
            } else return 0;
        }
        for(int i=0; i<=nums.length-4; i++) {
            int t, t1, t2;
            for(int j=i+1; j<nums.length-2; j++) {
                for(int k=j+1; k<nums.length-1; k++) {
                    t = nums[i];
                    t1 = nums[j];
                    t2 = nums[k];
                    t += (t1 + t2);
                    for(int z = k+1; z<nums.length; z++) {
                        if(t == nums[z]) {
                            str = new StringBuilder();
                            str.append(i);
                            str.append(j);
                            str.append(k);
                            str.append(z);
                            q.add(str.toString());
                        }
                    }
                }
            }
        }
        return q.size();
    }
}
