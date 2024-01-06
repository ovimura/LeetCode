package MaximumNumberOfBallsInABox;

public class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        int[] balls = new int[highLimit+1];
        while(lowLimit <= highLimit) {
            if(Integer.toString(lowLimit).length()>1) {
                char[] chars = Integer.toString(lowLimit).toCharArray();
                int sum = 0;
                for(char c: chars) {
                    sum += Character.getNumericValue(c);
                }
                balls[sum]++;
            } else {
                balls[lowLimit]++;
            }
            lowLimit++;
        }
        int most = 0;
        for(int i: balls) {
            if(i>most)
                most = i;
        }
        return most;
    }
}
