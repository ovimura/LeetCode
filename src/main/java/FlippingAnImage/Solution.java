package FlippingAnImage;

public class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        int[][] result = new int[A.length][A[0].length];
        for(int i=0; i<A.length; i++) {
            for(int j=0; j<A[0].length; j++) {
                result[i][j] = A[i][(A[0].length-1)-j];
            }
            for(int k=0; k<A[0].length; k++) {
                if(result[i][k] == 0)
                    result[i][k] = 1;
                else
                    result[i][k] = 0;
            }
        }
        return result;
    }
}
