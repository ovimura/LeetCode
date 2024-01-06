package FloodFill;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    class Point <X, Y>{
        int x;
        int y;
        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "Point{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        List<Point<Integer, Integer>> changed_points = new ArrayList<>();
        changed_points.add(new Point(sr, sc));
        int orig_color = image[sr][sc];
        int count = 0;
        while(changed_points.size()>0) {
            Point p = changed_points.remove(0);
            if(((p.x >=0 && p.x < image.length) && (p.y>=0 && p.y < image[0].length)) && image[p.x][p.y] == orig_color) {
                image[p.x][p.y] = color;
                if(p.x-1 >=0 && image[p.x-1][p.y] == orig_color) {
                    changed_points.add(new Point(p.x-1, p.y));
                }
                if(p.x+1 < image.length && image[p.x+1][p.y] == orig_color) {
                    changed_points.add(new Point(p.x+1, p.y));
                }
                if(p.y-1>=0 && image[p.x][p.y-1] == orig_color) {
                    changed_points.add(new Point(p.x, p.y - 1));
                }
                if(p.y+1 < image[0].length && image[p.x][p.y+1] == orig_color) {
                    changed_points.add(new Point(p.x, p.y+1));
                }
                if(count > image.length * image[0].length)
                    break;
                count++;
            }
        }
        return image;
    }
}