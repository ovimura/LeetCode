package MinimumNumberOfArrowsToBurstBalloons;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, Comparator.comparingInt(a -> a[1]));
        int arrow = 1;
        int end = points[0][1];
        for(int i = 1;i < points.length;i++){
            if(points[i][0] > end){
                arrow++;
                end = points[i][1];
            }
        }
        return arrow;
    }
}
