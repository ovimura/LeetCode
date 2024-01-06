public class Solution {
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