package NextGreaterElementI;

public class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] rs = new int[nums1.length];
        for(int i=0; i<nums1.length; i++) {
            boolean found = false;
            for(int j=0; j<nums2.length; j++) {
                if(nums1[i]==nums2[j]) {
                    for(int z=j+1; z<nums2.length; z++) {
                        if(nums2[z] > nums1[i]) {
                            rs[i] = nums2[z];
                            found = true;
                            break;
                        }
                    }
                    if(found)
                        break;
                }
            }
            if(!found)
                rs[i] = -1;
        }
        return rs;
    }
}
