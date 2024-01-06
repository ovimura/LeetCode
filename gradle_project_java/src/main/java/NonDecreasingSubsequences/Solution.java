package NonDecreasingSubsequences;

import java.util.*;

public class Solution {
    public List<List<Integer>> findSubsequences_v1(int[] nums) {
        Set<List<Integer>> r = new HashSet<>();
        for(int i=0; i<nums.length-1; i++) {
            for(int j=i+1; j<nums.length; j++) {
                List<Integer> t = new ArrayList<>();
                boolean non_decreasing = true;
                t.add(nums[i]);
                int prev = nums[j];
                for(int k = j; k<nums.length; k++) {
                    if(nums[i]>nums[k])
                        non_decreasing = false;
                    if(prev > nums[k])
                        non_decreasing = false;
                    if(!non_decreasing)
                        break;
                    t.add(nums[k]);
                    prev = nums[k];
                }
                if(non_decreasing)
                    r.add(t);
                non_decreasing = true;
                List<Integer> tt = new ArrayList<>();
                prev = nums[i];
                for(int k = i; k<=j; k++) {
                    if(prev > nums[k])
                        non_decreasing = false;
                    if(!non_decreasing)
                        break;
                    tt.add(nums[k]);
                    prev = nums[k];
                }
                if(non_decreasing)
                    r.add(tt);
            }
        }
        return new ArrayList<>(r);
    }



    public List<List<Integer>> findSubsequences(int[] nums) {
        List<List<Integer>> res = new LinkedList<>();
        helper(new LinkedList<Integer>(), 0, nums, res);
        return res;
    }
    private void helper(LinkedList<Integer> list, int index, int[] nums, List<List<Integer>> res){
        if(list.size()>1) res.add(new LinkedList<Integer>(list));
        Set<Integer> used = new HashSet<>();
        for(int i = index; i<nums.length; i++){
            if(used.contains(nums[i])) continue;
            if(list.size()==0 || nums[i]>=list.peekLast()){
                used.add(nums[i]);
                list.add(nums[i]);
                helper(list, i+1, nums, res);
                list.remove(list.size()-1);
            }
        }
    }
}
