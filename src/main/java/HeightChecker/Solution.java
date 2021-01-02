package HeightChecker;

public class Solution {

    public int heightChecker(int[] heights) {
        int[] target = new int[heights.length];
        int[] tmp = new int[heights.length];
        for(int i=0; i<heights.length; i++){
            tmp[i] = heights[i];
        }
        for(int i=0; i<target.length; i++) {
            int m = 101;
            int idx = -1;
            for(int j=0; j<heights.length; j++) {
                if(heights[j] <  m) {
                    m = heights[j];
                    idx = j;
                }
            }
            heights[idx] = 101;
            target[i] = m;
        }
        int c = 0;
        for(int i=0; i<heights.length; i++) {
            if(tmp[i] != target[i])
                c++;
        }
        return c;
    }
}
