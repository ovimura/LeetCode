package RangeAdditionII;

public class Solution {
    public int maxCount_slow(int m, int n, int[][] ops) {
        int[][] M = new int[m][n];
        int max = 0;
        for(int[]op: ops) {
            for(int i=0; i<op[0]; i++) {
                for(int j=0; j<op[1]; j++) {
                    M[i][j]++;
                    if(max < M[i][j])
                        max = M[i][j];
                }
            }
        }
        int count = 0;
        for(int i=0; i<M.length; i++) {
            for(int j=0; j<M[0].length; j++) {
                if(M[i][j] == max)
                    count++;
            }
        }
        return count;
    }

    public int maxCount(int m, int n, int[][] ops) {
        if(ops.length == 0)
            return m*n;
        int x = ops[0][0];
        int y = ops[0][1];
        for(int[]op: ops) {
            if(x > op[0])
                x = op[0];
            if(y > op[1])
                y = op[1];
        }
        return x*y;
    }
}
