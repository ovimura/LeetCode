package MatrixDiagonalSum;

public class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;
        for(int i=0; i<n; i++) {
            sum += mat[i][i];
        }
        int m = mat[0].length;
        for(int j=0; j<m; j++) {
            if((m-j-1) != j)
                sum += mat[j][m-j-1];
        }
        return sum;
    }
}