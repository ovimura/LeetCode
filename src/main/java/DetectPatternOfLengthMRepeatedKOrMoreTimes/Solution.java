package DetectPatternOfLengthMRepeatedKOrMoreTimes;


public class Solution {
    public boolean containsPattern(int[] arr, int m, int k) {
        for (int i = 0, count = 0; i + m < arr.length; i++)
            if (arr[i] != arr[i + m])
                count = 0;
            else if (++count == (k - 1) * m)
                return true;

        return false;
    }
}
