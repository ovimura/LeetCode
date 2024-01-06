package MedianOfTwoSortedArrays;

import java.util.Arrays;

public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int mid1 = -1;
        int mid2 = -1;

        int[]  larger, smaller;
        if(nums1.length>nums2.length){
            larger = nums1;
            smaller = nums2;
        } else {
            smaller = nums1;
            larger = nums2;
        }

        if((larger.length + smaller.length)%2==0){
            mid2 = (larger.length + smaller.length)/2;
            mid1 = mid2-1;
        } else {
            mid1 = (larger.length + smaller.length)/2;
        }
        int i = 0;
        int j = 0;
        while((i+j)<=mid1){
            if((i+j)==mid1){
                if(i<larger.length && j<smaller.length){
                    if(larger[i]<smaller[j]){
                        mid1 = larger[i];
                        i++;
                    } else {
                        mid1 = smaller[j];
                        j++;
                    }
                    if(mid2==-1){
                        return mid1;
                    } else {
                        if(j<smaller.length && i<larger.length){
                            mid2 = (Math.min(larger[i], smaller[j]));
                        } else if(i<larger.length){
                            mid2 = larger[i];
                        } else {
                            mid2 = smaller[j];
                        }
                        return ((float)mid1 + mid2)/2;
                    }
                } else {
                    if(mid2==-1){
                        return larger[i];
                    } else {
                        return ((float)larger[i] + larger[i+1])/2;
                    }
                }


            } else {
                if(i<larger.length && j<smaller.length){
                    if(larger[i]<smaller[j]){
                        i++;
                    } else {
                        j++;
                    }
                } else if(i<larger.length){
                    i++;
                } else {
                    j++;
                }
            }
        }
        return 0;
    }

}
