package LargestTriangleArea;

public class Solution {
    public double largestTriangleArea(int[][] points) {
        double area = Double.MIN_VALUE;
        for(int i=0; points.length >= 3 && i<points.length-2; i++) {
            double a = Double.MIN_VALUE;
            for(int j=i+1; j<points.length-1; j++) {
                for(int k=j+1; k<points.length; k++) {
                    double s1 = (getDistance(points[i], points[j]));
                    double s2 = (getDistance(points[i], points[k]));
                    double s3 = (getDistance(points[j], points[k]));
                    double s = ( s1 + s2 + s3) / 2;

                    double aa = Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
                    if (aa > a)
                        a = aa;
                }
            }
            if(a > area)
                area = a;
        }
        return area;
    }

    private double getDistance(int[] p1, int[] p2) {
        return Math.sqrt(Math.pow((p2[0]-p1[0]),2) + Math.pow((p2[1]-p1[1]),2));
    }
}
