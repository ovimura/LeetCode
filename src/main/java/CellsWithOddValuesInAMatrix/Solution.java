package CellsWithOddValuesInAMatrix;

public class Solution {
    public int oddCells(int n, int m, int[][] indices) {
        int [][] matrix = new int[n][m];
        for (int i=0; i<indices.length; i++) {
            int r = indices[i][0];
            System.out.println(matrix[r].length);
            for(int j=0; j<matrix[r].length; j++) {
                matrix[r][j] += 1;
            }
            int c = indices[i][1];
            for(int k=0; k<matrix.length; k++) {
                matrix[k][c] += 1;
            }
        }
        int result = 0;
        for(int[] r: matrix) {
            for(int i: r){
                System.out.print(i + " ");
                if(i%2 == 1) {
                    result += 1;
                }
            }
            System.out.println();
        }
        return result;
    }
}
