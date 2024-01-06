package ProjectionAreaOf3DShapes;

public class Solution {
    public int projectionArea(int[][] grid) {
        int area = 0;
        // xy
        for(int i=0; i<grid.length; i++) {
            for(int j=0; j<grid[0].length; j++) {
                if(grid[i][j]>0)
                    area += 1;
            }
        }
        // zx
        for(int x=0; x<grid[0].length; x++) {
            int m = 0;
            for(int z=0; z<grid[0].length; z++)
                m = Math.max(m, grid[z][x]);
            area += m;
        }
        // zy
        for(int z=0; z<grid[0].length; z++) {
            int m = 0;
            for(int y = 0; y<grid.length; y++)
                m = Math.max(m, grid[z][y]);
            area += m;
        }
        return area;
    }
}
