package SqrtX;

// url: https://www.youtube.com/watch?v=HBdVVFqTrUU
public class Solution {
    String pp = "0";
    public int mySqrt1(int x) {
        int r = 0;
        String re = "";
        if(x==0)
            return r;
        else {
            String n = String.valueOf(x);
            if((n.length() % 2) == 1)
                n = "0" + n;
            Integer[] groups = new Integer[(n.length()/2)];
            int idx=0;
            int i = n.length();
            for(; i>0; i-=2){
                if(i-2 < 0)
                    groups[idx] = Integer.parseInt(n.substring(0, i+1));
                else
                    groups[idx] = Integer.parseInt(n.substring(i-2, i));
                idx++;
            }
            int k =0;
            int temp = 0;
            for(int j=groups.length-1; j>=0; j--) {
                int findPerfectSquare;
                if (j == groups.length - 1) {
                    findPerfectSquare = findPerfectSquareRoot(groups[j]);
                    k = findPerfectSquare;
                    temp = k;
                    re = re + findPerfectSquare;
                } else {
                    findPerfectSquare = findPerfectSquareRoot(groups[j], temp+k, (Integer.parseInt(pp+((groups[j+1]<10)?"0"+groups[j+1]:groups[j+1]))-(temp*k)));
                    re = re + findPerfectSquare;
                    temp = Integer.parseInt(Integer.toString(temp + k) + findPerfectSquare);
                    k = findPerfectSquare;
                }
            }
        }
        return Integer.parseInt(re);
    }

    int findPerfectSquareRoot(int g) {
        int ps = 1;
        if(g>0)
            while((ps*ps)<=g)
                ps++;
        else
            return 0;
        return --ps;
    }

    int findPerfectSquareRoot(int g, int temp, int val) {
        pp = Integer.toString(val);
        String v = Integer.toString(val) + ((g<10)?"0"+g:g);
        String t = Integer.toString(temp);
        for(int i=1; i<10; i++) {
            int a = Integer.parseInt(t+i);
            if(a*i>Integer.parseInt(v))
                return i-1;
        }
        return 9;
    }

    public int mySqrt(int x) {
        long start = 0;
        long end = x;
        while(start+1<end) {
            long mid = start + (end-start)/2;
            if(mid*mid == x) {
                return (int)mid;
            } else if (mid*mid < x) {
                start = mid;
            } else {
                end = mid;
            }
        }
        if(end*end == x)
            return (int)end;
        return (int)start;
    }


}

