package GoogleInterview;

import java.util.ArrayList;
import java.util.Arrays;

public class GenerateAllSubstringsOfAGivenString {
    public void substring(String s) {
        char[] chars = s.toCharArray();
        int n = chars.length;
        for (int len = 1; len <= n; len++) {
            // Pick ending point
            for (int i = 0; i <= n - len; i++) {
                //  Print characters from current
                // starting point to current ending
                // point.
                int j = i + len - 1;
                for (int k = i; k <= j; k++) {
                    System.out.print(chars[k]);
                }

                System.out.println();
            }
        }
    }

    public void substring1(String s) {
        for(int i=0; i<s.length(); i++) {
            for(int j=i+1; j<=s.length(); j++) {
                System.out.println(s.substring(i, j));
            }
        }
    }

    void printArray(char[] arr) {
        String s = "";
        for(int i=0; i<arr.length; i++) {
            s += arr[i];
        }
        System.out.print(s + " ");
    }

    public void allPossibleSubstrings(char[] arr, int idx, char[] res) {
        if(idx == arr.length) {
            int l = res.length;
            if(l != 0)
                //System.out.print(Arrays.toString(res));
                printArray(res);
        } else {
            allPossibleSubstrings(arr, idx+1, res);
            char[] chars = new char[res.length+1];
            int i;
            for(i=0; i<chars.length-1; i++)
                chars[i] = res[i];
            chars[i] = arr[idx];
            allPossibleSubstrings(arr, idx+1, chars);
        }
        return;
    }

    public void printSubsequences(char[] arr, int n) {
        int len = (int)Math.pow(2, n);
        for(int i=1; i<len; i++) {
            for(int j=0; j<n; j++) {
                if((i&(1<<j)) != 0) {
                    System.out.print(arr[j] + " ");
                }
            }
            System.out.println();
        }
    }

}
