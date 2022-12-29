package CheckIfItIsAStraightLine;

public class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        // (y2-y1)/(x2-x1) = (y3-y1)/(x3-x1)
        if(coordinates.length == 2)
            return true;
        double slope = 0.0;
        if((coordinates[1][0]-coordinates[0][0]) == 0)
            slope = Double.MAX_VALUE;
        else
            slope = ((double)(coordinates[1][1]-coordinates[0][1])/(double)(coordinates[1][0]-coordinates[0][0]));
        for(int i=2; i<coordinates.length; i++) {
            double t_slope = 0.0;
            if((coordinates[i][0]-coordinates[0][0]) == 0)
                t_slope = Double.MAX_VALUE;
            else
                t_slope = (double)(coordinates[i][1]-coordinates[0][1])/(double)(coordinates[i][0]-coordinates[0][0]);
            if(t_slope != slope)
                return false;
        }
        return true;
    }
}
