package SurfaceAreaOf3DShapes;

public class Solution {
    public int surfaceArea(int[][] grid) {
        int surface = 0;
        for(int i=0; i<grid.length; i++) {
            for(int j=0; j<grid[0].length; j++) {
                if(grid[i][j]>0) {
                    surface += 2 + grid[i][j]*4;
                }
                if(i>0) {
                    surface -= Math.min(grid[i][j], grid[i-1][j])*2;
                }
                if(j>0) {
                    surface -= Math.min(grid[i][j], grid[i][j-1])*2;
                }
            }
        }
        return surface;
    }
}
