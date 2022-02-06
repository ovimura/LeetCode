package TeemoAttacking;

public class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int pos = 0;
        for(int i=0; i<timeSeries.length-1; i++) {
            if(timeSeries[i]+duration <= timeSeries[i+1])
                pos+=duration;
            else if(timeSeries[i]+duration > timeSeries[i+1]){
                pos+=timeSeries[i+1]-timeSeries[i];
            }
        }
        pos+=duration;
        return pos;
    }
}
