package InsertInterval;

import java.util.*;

// Reference: https://wentao-shao.gitbook.io/leetcode/array/57.insert-interval
public class Solution {
    public int[][] insert1(int[][] intervals, int[] newInterval) {
        if(intervals.length == 0)
            return new int[][] {new int[] {newInterval[0],newInterval[1]}};
        List<Integer[]> list = new ArrayList<>();
        int left = newInterval[0], right = newInterval[1];
        for(int[] interval: intervals){
            if(newInterval[0] >= interval[0] && newInterval[0] <= interval[1]) {
                left = Math.min(newInterval[0], interval[0]);
            }
            if(newInterval[1] >= interval[0] && newInterval[1] <= interval[1])
                right = Math.max(newInterval[1], interval[1]);
        }
        for(int j=0; j<intervals.length; j++) {
            if(intervals[j][0]==left || intervals[j][1]==right ||
                    (intervals[j][0]>left && intervals[j][0]<right && (intervals[j][1]>left && intervals[j][1]<right)))
                continue;
            else
                list.add(new Integer[]{intervals[j][0], intervals[j][1]});
        }
        int j;
        for(j=0; j<list.size(); j++) {
            if(list.get(j)[0]>right)
                break;
        }
        if(list.size()>1)
            list.add(j, new Integer[]{left, right});
        else if(j==0)
            list.add(0,new Integer[]{left, right});
        else
            list.add(new Integer[]{left, right});
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
