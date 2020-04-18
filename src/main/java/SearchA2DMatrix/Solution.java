package SearchA2DMatrix;

public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0)
            return false;
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i=0; i<m; i++) {
            if(n != 0 && target <= matrix[i][n-1])
                for(int j=0; j<n; j++) {
                    if(target == matrix[i][j])
                        return true;
                }
        }
        return false;
    }
}
