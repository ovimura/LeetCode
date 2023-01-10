package PathCrossing;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public boolean isPathCrossing(String path) {
        int x = 0, y = 0;
        List<Integer[]> points = new ArrayList<>();
        points.add(new Integer[]{0,0});
        for(char c: path.toCharArray()) {
            if(c == 'N') {
                y++;
                for(Integer[] p: points) {
                    if(p[0] == x && p[1] == y)
                        return true;
                }
                points.add(new Integer[]{x, y});
            } else if (c == 'S') {
                y--;
                for(Integer[] p: points) {
                    if(p[0] == x && p[1] == y)
                        return true;
                }
                points.add(new Integer[]{x, y});
            } else if (c == 'E') {
                x++;
                for(Integer[] p: points) {
                    if(p[0] == x && p[1] == y)
                        return true;
                }
                points.add(new Integer[]{x, y});
            } else if (c == 'W') {
                x--;
                for(Integer[] p: points) {
                    if(p[0] == x && p[1] == y)
                        return true;
                }
                points.add(new Integer[]{x, y});
            }
        }
        return false;
    }
}
