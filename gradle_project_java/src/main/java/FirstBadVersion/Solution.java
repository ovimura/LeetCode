package FirstBadVersion;

public class Solution {

    public int firstBadVersion(int n) {
        int l = 1;
        int r = n;
        while(l<r) {
            int mid = l + (r - l)/2;
            if(isBadVersion(mid)) {
                r = mid;
            } else
                l = mid + 1;
        }
        return l;
    }



    public int firstBadVersion1(int n) {
        int i=1;
        while(i<n) {
            if(isBadVersion(i)) {
                return i;
            }
            i++;
        }
        return n;
    }

    boolean isBadVersion(int v) {
        return true;
    }
}
