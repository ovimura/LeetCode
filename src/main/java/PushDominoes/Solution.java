package PushDominoes;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public String pushDominoes(String dominoes) {
        int n = dominoes.length();
        int[] count = new int[n];
        char[] chars = new char[n];
        for(int j=0; j<dominoes.length(); j++)
            chars[j] = dominoes.charAt(j);
        for(int i=1; i<n; ++i) {
            if(chars[i-1] == 'R' && chars[i] == '.') {
                chars[i] = 'R';
                count[i] = count[i-1]+1;
            }
        }
        for(int i = n-2, cur = 0; i>=0; --i) {
            if(chars[i+1] != 'L') continue;
            cur = count[i+1] +1;
            if(chars[i] == '.' || count[i] > cur) {
                chars[i] = 'L';
                count[i] = cur;
            } else if (chars[i] == 'R' && count[i] == cur) {
                chars[i] = '.';
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char c: chars)
            sb.append(c);
        return sb.toString();
    }

    public String pushDominoes_draft1(String dominoes) {
        char[] chars = new char[dominoes.length()];
        for(int i=0; i<dominoes.length(); i++) {
            if(dominoes.charAt(i) == 'L') {
                if(i>0) {
                    chars[i-1] = 'L';
                    chars[i] = 'L';
                }
            }
            else if(dominoes.charAt(i) == 'R') {
                if(i<dominoes.length()-1) {
                    chars[i+1] = 'R';
                    chars[i] = 'R';
                }
            }
            else if(dominoes.charAt(i) == '.' && chars[i] != 'R' && chars[i] != 'L') {
                chars[i] = '.';
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char c: chars) {
            sb.append(c);
        }
        return sb.toString();
    }
}
