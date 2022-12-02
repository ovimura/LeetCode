package ValidBoomerang;
/*
*  Solution - https://medium.com/algorithm-and-datastructure/valid-boomerang-414f9df2b22c
*
* */
public class Solution {
    public boolean isBoomerang(int[][] points) {
        if(points[0] == points[1] || points[1] == points[2] || points[0] == points[2])
            return false;
        return (points[0][0]*(points[1][1]-points[2][1]) + points[1][0]*(points[2][1]-points[0][1]) +
                points[2][0]*(points[0][1]-points[1][1])) != 0;
    }
}
