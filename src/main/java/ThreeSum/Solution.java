package ThreeSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<Integer> integers = new ArrayList<>();
        List<List<Integer>> triplets = new ArrayList<>();
        TreeSet<String> setTriplets = new TreeSet<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0; i<n-2; i++) {
            for(int j = i+1; j<n-1; j++) {
                for(int k = j+1; k<n; k++) {
                    //System.out.println(i + " " + j + " " + k);
                    if(nums[i]+nums[j]+nums[k] == 0) {
                        String str = String.valueOf(nums[i]) + ";" +String.valueOf(nums[j]) + String.valueOf(nums[k]);
                        if(!setTriplets.contains(str)) {
                            integers.add(nums[i]);
                            integers.add(nums[j]);
                            integers.add(nums[k]);
                            triplets.add(integers);
                            setTriplets.add(str);
                            integers = new ArrayList<>();
                        }
                    }
                }
            }
        }
        return triplets;
    }

    public List<List<Integer>> threeSum1(int[] nums) {
        List<Integer> integers = new ArrayList<>();
        List<List<Integer>> triplets = new ArrayList<>();
        TreeSet<String> setTriplets = new TreeSet<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0; i<n-2; i++) {
            int j = i+1;
            int k = nums.length -1;
            while(j<k) {
                //System.out.println(i + " " + j + " " + k);
                if (nums[i] + nums[j] + nums[k] == 0) {
                    String str = String.valueOf(nums[i]) + ";" + String.valueOf(nums[j]) + String.valueOf(nums[k]);
                    if (!setTriplets.contains(str)) {
                        integers.add(nums[i]);
                        integers.add(nums[j]);
                        integers.add(nums[k]);
                        triplets.add(integers);
                        setTriplets.add(str);
                        integers = new ArrayList<>();
                    }
                } else if (nums[i] + nums[j] + nums[k] < 0)
                    j++;
                else
                    k--;
            }
        }
        return triplets;
    }

    public List<List<Integer>> threeSum2(int[] nums) {
        Arrays.sort(nums);
        ArrayList<List<Integer>> triplets = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            while (j < k) {
                if (k < nums.length - 1 && nums[k] == nums[k + 1]) {
                    k--;
                    continue;
                }
                if (nums[i] + nums[j] + nums[k] > 0) {
                    k--;
                } else if (nums[i] + nums[j] + nums[k] < 0) {
                    j++;
                } else {
                    ArrayList<Integer> integers = new ArrayList<>();
                    integers.add(nums[i]);
                    integers.add(nums[j]);
                    integers.add(nums[k]);
                    triplets.add(integers);
                    j++;
                    k--;
                }
            }
        }
        return triplets;
    }

    public List<List<Integer>> threeSum3(int[] nums) {
        Arrays.sort(nums);
        ArrayList<List<Integer>> triplets = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            while (j < k) {
                if (k < nums.length - 1 && nums[k] == nums[k + 1]) {
                    k--;
                    continue;
                }
                if (nums[i] + nums[j] + nums[k] == 0) {
                    ArrayList<Integer> integers = new ArrayList<>();
                    integers.add(nums[i]);
                    integers.add(nums[j]);
                    integers.add(nums[k]);
                    triplets.add(integers);
                    j++;
                    k--;
                } else {
                    k--;
                    j++;
                }
            }
        }
        return triplets;
    }

}
