package Shift2DGrid;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> result = new ArrayList<>();
        int m = grid.length;
        int n = grid[0].length;
        for(int z=0; z<k; z++) {
            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i < m; i++) {
                temp.add(grid[i][n - 1]);
                int t = grid[i][0];
                for (int j = 0; j < n - 1; j++) {
                    int a = grid[i][j + 1];
                    grid[i][j + 1] = t;
                    t = a;
                }
            }
            for (int i = 0; i < m - 1; i++) {
                grid[i + 1][0] = temp.get(i);
            }
            if (m > 0 && n > 0) {
                grid[0][0] = temp.get(temp.size() - 1);
            }
        }
        for(int i=0; i<m; i++) {
            List<Integer> l = new ArrayList<>();
            for(int j=0; j<n; j++) {
                l.add(grid[i][j]);
            }
            result.add(l);
        }
        return result;
    }
}
