package CountOddNumbersInAnIntervalRange;

// Reference: https://github.com/YuriSpiridonov/LeetCode/blob/master/Easy/1523.CountOddNumbersinanIntervalRange.py
public class Solution {
    public int countOdds(int low, int high) {
        if((low % 2 == 1) && (1 == high % 2))
            return (1 + (high + 1 - low))/2;
        else
            return (high + 1 - low) / 2;
    }
}
