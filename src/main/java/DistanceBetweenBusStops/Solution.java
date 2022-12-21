package DistanceBetweenBusStops;

public class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int clockwise = 0;
        int counterclockwise = 0;
        int stops = 0, i = 0;
        while(stops!=2) {
            if(i == start && stops == 0) {
                stops++;
            }
            if(stops == 1 && i == destination) {
                stops++;
                break;
            }
            if(stops == 1) {
                clockwise += distance[i];
            }
            if(i == distance.length-1)
                i = -1;
            i++;
        }
        stops = 0;
        i=distance.length-1;
        while(stops!=2) {
            if(i == start && stops == 0) {
                stops++;
            }
            if(stops == 1 && i == destination) {
                counterclockwise += distance[i];
                stops++;
                break;
            }
            if(stops == 1 && i != start) {
                counterclockwise += distance[i];
            }
            if(i == 0)
                i = distance.length;
            i--;
        }
        return Math.min(clockwise, counterclockwise);
    }
}
