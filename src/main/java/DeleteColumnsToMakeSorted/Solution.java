package DeleteColumnsToMakeSorted;

public class Solution {
    public int minDeletionSize(String[] A) {
        int res = 0;
        for(int c=0; c<A[0].length(); c++) {
            int cnt = 0;
            for(int i=0; i<A.length-1; i++) {
                if(A.length > 1 && (A[i].charAt(c) <= A[i+1].charAt(c))) {
                    cnt++;
                }
            }
            if(cnt == A.length-1)
                res++;
        }
        return A[0].length() - res;
    }
}
