package TrappingRainWater;

public class Solution {
    public int trap(int[] height) {
        int[] res = new int[height.length];
        for(int i=0; i<height.length; i++) {
            int L = height[i];
            for(int j=0; j<i; j++) {
                L = Math.max(L, height[j]);
            }
            int R = height[i];
            for(int k=i+1; k<height.length; k++) {
                R = Math.max(R, height[k]);
            }
            res[i] = Math.min(L, R)-height[i];
            System.out.println(Math.min(L, R)-height[i]);
        }
        int sum = 0;
        for(int i=0; i<res.length; i++) {
            sum += res[i];
        }
        return sum;
    }
}
