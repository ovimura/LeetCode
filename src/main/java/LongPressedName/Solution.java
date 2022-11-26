package LongPressedName;

import java.util.ArrayList;
import java.util.List;

/*
*
* Your friend is typing his name into a keyboard. Sometimes, when typing a character c, the key might get long pressed,
* and the character will be typed 1 or more times.
*
* You examine the typed characters of the keyboard. Return True if it is possible that it was your friends name,
* with some characters (possibly none) being long pressed.
*
* */
public class Solution {
    public boolean isLongPressedName(String name, String typed) {
        if(name.length() > typed.length()) return false;
        int i=0, j=0, n = name.length(), t = typed.length();
        while(i<n && j<t) {
            char c = name.charAt(i);
            if(c != typed.charAt(j)) return false;
            int countN=0, countT=0;
            while(i<n && name.charAt(i) == c) {
                i++;
                countN++;
            }
            while(j<t && typed.charAt(j) == c) {
                j++;
                countT++;
            }
            if(countN > countT) return false;
        }
        if(i==n && j==t) return true;
        return false;
    }
}
