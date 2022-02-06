package constructTheRectangle;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] constructRectangle(int area) {
        List<Integer[]> r = new ArrayList<>();
        for(int i=1; i<=area; i++) {
            for(int j=1; j<=Math.sqrt(area); j++) {
                if(area == i*j) {
                    r.add(new Integer[]{i,j});
                }
            }
        }
        int between = Integer.MAX_VALUE;
        for(int k=0; k<r.size(); k++) {
            if((r.get(k)[0] - r.get(k)[1]) >= 0 && (r.get(k)[0] - r.get(k)[1]) < between) {
                between = r.get(k)[0] - r.get(k)[1];
            }
        }
        int[] res = new int[2];
        for(int k=0; k<r.size(); k++) {
            if((r.get(k)[0] - r.get(k)[1]) >= 0 && (r.get(k)[0] - r.get(k)[1]) == between) {
                res[0] = r.get(k)[0];
                res[1] = r.get(k)[1];
            }
        }
        return res;
    }


    public int[] constructRectangle1(int area) {
        List<Integer[]> r = new ArrayList<>();
        int between = Integer.MAX_VALUE;
        int[] res = new int[2];
        for (int i = 1; i <= area; i++) {
            for (int j = (int)Math.sqrt(area); j >0 ; j--) {
                if (area == i * j) {
                    r.add(new Integer[]{i, j});
                    if ((i - j) >= 0 && (i - j) < between) {
                        between = i - j;
                        res[0] = i;
                        res[1] = j;
                    }
                }
                if (area < i * j)
                    break;
            }
        }
        if (area == 1) {
            res[0] = 1;
            res[1] = 1;
        }
        return res;
    }

    public int[] constructRectangle2(int area) {
        int[] res = new int[]{area, 1};
        for (int i = 1; i*i <= area; i++) {
            if(area % i == 0 && (area/i - i)<(res[0]-res[1])) {
                res[0] = area / i;
                res[1] = i;
            }
        }
        return res;
    }
}
