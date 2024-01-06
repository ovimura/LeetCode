package LongestCommonPrefix;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        int count = 0;
        int idx = 0;
        while(idx < prefix.length()) {
            boolean found = false;
            for (int i = 0; i < strs.length; i++) {
                if(idx>=strs[i].length())
                    found = true;
                else if (strs[i].charAt(idx) != prefix.charAt(idx))
                    found = true;
            }
            if (!found)
                count++;
            else
                break;
            idx++;
        }
        return prefix.substring(0,count);
    }
}
