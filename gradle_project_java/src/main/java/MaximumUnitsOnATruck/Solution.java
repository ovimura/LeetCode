package MaximumUnitsOnATruck;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    class Box implements Comparable<Box> {
        public int noOfBoxes = 0;
        public int noOfUnits = 0;

        public Box(int b, int u) {
            noOfBoxes = b;
            noOfUnits = u;
        }

        public int compareTo(Box b) {
            return b.noOfUnits - this.noOfUnits;
        }
    }

    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int total = 0;
        List<Box> bt = new ArrayList<>();
        for(int i=0; i<boxTypes.length; i++) {
            bt.add(new Box(boxTypes[i][0], boxTypes[i][1]));
        }
        Collections.sort(bt);
        int i=0;
        int n = 0;
        while(i < bt.size() && bt.get(i).noOfBoxes + n <= truckSize) {
            total += (bt.get(i).noOfBoxes * bt.get(i).noOfUnits);
            n += bt.get(i).noOfBoxes;
            i++;
        }
        if(i == bt.size())
            return total;
        if (n < truckSize) {
            int tmp = truckSize - n;
            total += (tmp *bt.get(i).noOfUnits);
        }
        return total;
    }
}
