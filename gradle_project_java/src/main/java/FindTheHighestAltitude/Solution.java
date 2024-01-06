package FindTheHighestAltitude;

public class Solution {
    public int largestAltitude(int[] gain) {
        int [] net_gain = new int[gain.length+1];
        for(int i=0; i<gain.length; i++) {
            net_gain[i+1] = net_gain[i] + gain[i];
        }

        int m = Integer.MIN_VALUE;

        for(int k=0; k<net_gain.length; k++) {
            if(net_gain[k] > m)
                m = net_gain[k];
        }
        return m;
    }
}
