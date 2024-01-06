package Sqrt;

public class Solution {
    public int mySqrt(int x) {
        int left = 0, right = x;
        while(left<=right) {
            int mid = left + (right-left)/2;
            if(mid*mid > x) {
                right = mid-1;
            } else if(mid*mid < x) {
                left = mid+1;
            } else {
                return mid;
            }
        }
        return right;
    }

    public int sqrt_root(int x) {
        int l = 0, r = x;
        while(l<=r) {
            int mid = l+(r-l)/2;
            if(mid*mid>x)
                r = mid-1;
            else if(mid*mid<x)
                l = mid+1;
            else
                return mid;
        }
        return r;
    }

    public int sqrt(int x) {
        int l=1, r=x;
        while (l<=r) {
            int mid = (l+r)/2;
            if(mid*mid == x)
                return mid;
            else if(mid*mid<x)
                l = mid+1;
            else if(mid*mid>x)
                r = mid-1;
        }
        return r;
    }

}
