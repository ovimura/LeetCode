package NumberOfRectanglesThatCanFormTheLargestSquare;

public class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int[] sqr = new int[rectangles.length];
        for(int i=0; i<rectangles.length; i++) {
            sqr[i] = Math.min(rectangles[i][0],rectangles[i][1]);
        }
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<sqr.length; i++) {
            if(sqr[i]>largest)
                largest = sqr[i];
        }
        int cnt = 0;
        for(int i: sqr)
            if(largest == i)
                cnt++;
        return cnt;
    }
}
