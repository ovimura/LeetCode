package NumberOfStepsToReduceANumberToZero;

public class Solution {
    public int numberOfSteps (int num) {
        int tmp = num;
        int steps = 0;
        while(tmp>0) {
            if(tmp%2 == 0) {
                tmp = tmp/2;
                steps++;
            } else {
                tmp--;
                steps++;
            }
        }
        return steps;
    }
}
