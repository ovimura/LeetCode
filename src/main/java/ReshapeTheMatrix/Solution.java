package ReshapeTheMatrix;

public class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if(mat != null && mat[0] != null) {
            int size = mat.length * mat[0].length;
            if(r*c == size) {
                int[][] temp = new int[r][c];
                int[] ints = new int[size];
                int k=0;
                for(int i=0; i<mat.length; i++) {
                    for(int j=0; j<mat[0].length; j++) {
                        ints[k++] = mat[i][j];
                    }
                }
                int z = 0;
                for(int i=0; i<r; i++) {
                    for(int j=0; j<c; j++) {
                        temp[i][j] = ints[z++];
                    }
                }
                return temp;
            }
        }
        return mat;
    }
}
