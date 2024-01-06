package KClosestPointsToOrigin;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Solution {

    public double calculateDistanceBetweenPoints(
            double x1,
            double y1,
            double x2,
            double y2) {
        return Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
    }

    public int[][] kClosest(int[][] points, int K) {
        int[][] res = new int[K][2];
        Map<Integer, Double> map = new TreeMap<>();
        Double[] dists = new Double[points.length];
        for(int i=0; i<points.length; i++) {
            dists[i] = calculateDistanceBetweenPoints(points[i][0], points[i][1], 0, 0);
        }
        Arrays.sort(dists);
        Double dist = dists[K-1];
        int a = 0;
        for(int k=0; k<points.length; k++) {
                if(calculateDistanceBetweenPoints(points[k][0],points[k][1],0,0)<=dist) {
                    res[a++] = points[k];
                }
        }
        return res;
    }

    public int[][] kClosest_slow(int[][] points, int K) {
        int[][] res = new int[K][2];
        Map<Integer, Double> map = new TreeMap<>();
        for(int i=0; i<points.length; i++) {
            map.put(i, calculateDistanceBetweenPoints(points[i][0], points[i][1], 0, 0));
        }
        Double min = Double.MAX_VALUE;
        Integer ke = 0;
        for(int k=0; k<K; k++) {
            min = Double.MAX_VALUE;
            ke=0;
            for(Integer key: map.keySet()) {
                if(min>map.get(key)) {
                    min = map.get(key);
                    ke = key;
                }
            }
            res[k][0] = points[ke][0];
            res[k][1] = points[ke][1];
            map.remove(ke, min);
        }
        return res;
    }



    int[][] points;
    public int[][] kClosest_On_inAvg_Ontimesn_WorstCase(int[][] points, int K) {
        this.points = points;
        sort(0, points.length - 1, K);
        return Arrays.copyOfRange(points, 0, K);
    }

    public void sort(int i, int j, int K) {
        if (i >= j) return;
        int k = ThreadLocalRandom.current().nextInt(i, j);
        swap(i, k);

        int mid = partition(i, j);
        int leftLength = mid - i + 1;
        if (K < leftLength)
            sort(i, mid - 1, K);
        else if (K > leftLength)
            sort(mid + 1, j, K - leftLength);
    }

    public int partition(int i, int j) {
        int oi = i;
        int pivot = dist(i);
        i++;

        while (true) {
            while (i < j && dist(i) < pivot)
                i++;
            while (i <= j && dist(j) > pivot)
                j--;
            if (i >= j) break;
            swap(i, j);
        }
        swap(oi, j);
        return j;
    }

    public int dist(int i) {
        return points[i][0] * points[i][0] + points[i][1] * points[i][1];
    }

    public void swap(int i, int j) {
        int t0 = points[i][0], t1 = points[i][1];
        points[i][0] = points[j][0];
        points[i][1] = points[j][1];
        points[j][0] = t0;
        points[j][1] = t1;
    }
}
