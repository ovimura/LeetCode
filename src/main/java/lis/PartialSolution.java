package lis;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

// https://leetcode.com/articles/longest-increasing-subsequence/#
public class PartialSolution {
        public int lengthOfLIS(int[] nums) {
            if(nums.length == 0)
                return 0;
            int len = 0;
            int temp = 0;
            int n = 0;
            List<Integer> list = new LinkedList<>();
            Map<Integer, Integer> m = new TreeMap<Integer, Integer>();
            int mx = 0;
            for(int i=0; i<nums.length; i++) {
                temp = nums[i];
                n = temp;
                mx = 0;
                for(int j=i; j<nums.length; j++) {
                    if(temp < nums[j]) {
                        list.add(nums[j]);
                        temp = nums[j];
                    } else if(n<nums[j] && temp > nums[j]) {
                        mx = list.size() + 1;
                        for(int k=0; k<list.size(); k++) {
                            if(list.get(k) > nums[j])
                                list.remove(k);
                        }
                        list.add(nums[j]);
                        temp = nums[j];
                    }
                }
                list.add(temp);
                if(mx > list.size())
                    m.put(n, mx);
                else
                    m.put(n, list.size());
                list = new LinkedList<>();
            }
            for (Integer k:m.keySet()) {
                if(len < m.get(k)) {
                    len = m.get(k);
                }
            }
            return len;
        }
}
