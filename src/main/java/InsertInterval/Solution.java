package InsertInterval;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Solution {
    public int[][] insert1(int[][] intervals, int[] newInterval) {

        List<Integer[]> list = new ArrayList<>();
        for(int[] interval: intervals){
            if(interval[1] < newInterval[0]){
                list.add(new Integer[]{interval[0], interval[1]});
            }else if(interval[0] > newInterval[1]){
                list.add(new Integer[]{newInterval[0], newInterval[1]});
                newInterval = interval;
            }else if(interval[1] >= newInterval[0] || interval[0] <= newInterval[1]){
                list.add(new Integer[]{Math.min(interval[0], newInterval[0]), Math.max(newInterval[1], interval[1])});
            }
        }
        int[][] result = new int[list.size()][2];
        for(int i=0; i<list.size();i++) {
            Integer[] temp = list.get(i);
            result[i][0] = temp[0];
            result[i][1] = temp[1];
        }
        return result;
    }

    public int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<int []> temp = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++){
            temp.add(intervals[i]);
        }
        temp.add(newInterval);
        int[][] result = new int[temp.size()][2];
        for (int i = 0; i < temp.size(); i++){
            result[i] = temp.get(i);
        }
        return merge_overlaps(result);
    }

    public int[][] merge_overlaps(int[][] intervals) {
        if(intervals.length==0)
            return new int[0][];
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] i1,int[] i2) {
                return Integer.compare(i1[0], i2[0]);
            }
        });
        ArrayList<int []> temp = new ArrayList<>();
        int[] current = intervals[0];
        for (int i = 1; i < intervals.length; i++){
            if(current[1] >= intervals[i][0]) {
                current[0] = Math.min(current[0], intervals[i][0]);
                current[1] = Math.max(current[1], intervals[i][1]);

            } else {
                temp.add(current);
                current = intervals[i];
            }
        }
        temp.add(current);
        int[][] result = new int[temp.size()][2];
        for (int i = 0; i < temp.size(); i++){
            result[i] = temp.get(i);
        }
        return result;
    }
}
