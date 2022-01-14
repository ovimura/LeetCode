package BinaryWatch;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> r = new ArrayList<>();
        for(int hh=0; hh<12; hh++) {
            for(int mn=0; mn<60; mn++) {
                if(aux(hh, mn, turnedOn))
                if(mn < 10)
                {
                    r.add(String.format("%d:0%d", hh, mn));
                } else {
                    r.add(String.format("%d:%d", hh, mn));
                }
            }
        }
        return r;
    }

    private boolean aux(int hh, int mn, int turnedOn) {
        int temp = 0;
        while (hh != 0 || mn != 0) {
            if(hh != 0) {
                temp += hh % 2;
                hh /= 2;
            }
            if(mn != 0) {
                temp += mn % 2;
                mn /= 2;
            }
        }
        return turnedOn == temp;
    }
}
