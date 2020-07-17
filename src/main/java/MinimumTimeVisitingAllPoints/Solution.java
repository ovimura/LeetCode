package MinimumTimeVisitingAllPoints;

public class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int x=points[0][0], y=points[0][1], count=0;
        for(int i=0; i<points.length; i++) {
            while(!(points[i][0] == x && points[i][1] == y)) {
                count++;
                if(x != points[i][0])
                    if (x < points[i][0]) {
                        x++;
                    } else if (x > points[i][0])
                        x--;
                if(y != points[i][1])
                    if (y < points[i][1]) {
                        y++;
                    } else if ( y > points[i][1])
                        y--;
            }
        }
        return count;
    }
}
