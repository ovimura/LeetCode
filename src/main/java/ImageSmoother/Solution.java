package ImageSmoother;

public class Solution {
    public int[][] imageSmoother(int[][] img) {
        int rows = img.length;
        int columns = img[0].length;
        int[][] r = new int[rows][columns];
        for(int i=0; i<rows; i++) {
            for(int j=0; j<columns; j++) {
                int count = 0;
                for(int ii = i-1; ii<=i+1; ++ii) {
                    for(int jj=j-1; jj<=j+1; ++jj) {
                        if(ii>=0 && ii<rows && jj>=0 && jj<columns) {
                            r[i][j] += img[ii][jj];
                            count++;
                        }
                    }
                }
                r[i][j] /= count;
            }
        }
        return r;
    }
}
