package IslandPerimeter;

public class Solution {
    public int islandPerimeter(int[][] grid) {
        int perimeter = 0;
        for(int i=0; i<grid.length; i++) {
            for(int j=0; j<grid[0].length; j++) {
                if(grid[i][j] == 1) {
                    if(j == 0) {
                        perimeter += 1;
                    }
                    if(j == grid[0].length-1) {
                        perimeter += 1;
                    }
                    if(i == 0) {
                        perimeter += 1;
                    }
                    if(i == grid.length-1) {
                        perimeter += 1;
                    }
                    if(grid[i][(j>0)?j-1:j] == 0) {
                        perimeter += 1;
                    }
                    if(grid[i][(j>=0 && j<grid[0].length-1)?j+1:j] == 0) {
                        perimeter += 1;
                    }
                    if(grid[(i>0)?i-1:i][j] == 0) {
                        perimeter += 1;
                    }
                    if(grid[(i>=0 && i<grid.length-1)?i+1:i][j] == 0) {
                        perimeter += 1;
                    }
                }
            }
        }
        return perimeter;
    }
}
