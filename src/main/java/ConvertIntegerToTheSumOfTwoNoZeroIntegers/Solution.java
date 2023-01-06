package ConvertIntegerToTheSumOfTwoNoZeroIntegers;

public class Solution {
    public int[] getNoZeroIntegers(int n) {
        for (int i = 1; i < n; ++ i) {
            int a = i;
            int b = n - a;
            if (nozeros(a) && nozeros(b)) {
                return new int[]{a, b};
            }
        }
        return null;
    }

    private boolean nozeros(int x) {
        while (x > 0) {
            if (x % 10 == 0) return false;
            x /= 10;
        }
        return true;
    }
}
