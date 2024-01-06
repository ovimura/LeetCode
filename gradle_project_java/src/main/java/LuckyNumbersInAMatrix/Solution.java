package LuckyNumbersInAMatrix;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> lucky = new ArrayList<>();
        int min = 1000000;
        int min_idx = -1;
        int max = 0;
        int max_idx = 0;
        int row = -1;
        for(int i=0; i<matrix.length; i++) {
            min = 1000000;
            min_idx = -1;
            max = 0;
            max_idx = 0;
            for(int j=0; j<matrix[0].length; j++) {
                if(matrix[i][j] < min) {
                    min = matrix[i][j];
                    min_idx = j;
                    row = i;
                }
            }
            if(min_idx >= 0 && row >= 0)
                for(int k=0; k<matrix.length; k++) {
                    if(matrix[k][min_idx] > max) {
                        max = matrix[k][min_idx];
                        max_idx = k;
                    }
                }
            if(row == max_idx) {
                lucky.add(matrix[max_idx][min_idx]);
            }
        }
        return lucky;
    }
}
