package NumberOfStudentsDoingHomeworkAtAGivenTime;

public class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int result = 0;
        for (int i=0; i<startTime.length; i++) {
            if(startTime[i] <= queryTime && queryTime <= endTime[i]) {
                result += 1;
            }
        }
        return result;
    }
}
