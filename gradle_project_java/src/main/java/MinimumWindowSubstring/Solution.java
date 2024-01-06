package MinimumWindowSubstring;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String minWindow(String s, String t) {
        if(s.length() < t.length())
            return "";
        else if (s.length() == t.length() && !s.equals(t) && s.length() == 1)
            return "";
        int hs[] = new int [300];
        int ht[] = new int [300];
        for(int i=0; i<t.length(); i++) {
            ht[t.charAt(i)]++;
        }
        int idx=0;
        int window_idx=-1;
        int window_length = Integer.MAX_VALUE;
        int window = 0;
        for (int j=0; j<s.length(); j++) {
            hs[s.charAt(j)]++;
            if (ht[s.charAt(j)] != 0 && hs[s.charAt(j)] <= ht[s.charAt(j)])
                window++;
            if (window == t.length()) {
                while (hs[s.charAt(idx)] > ht[s.charAt(idx)] || ht[s.charAt(idx)] == 0) {
                    if (hs[s.charAt(idx)] > ht[s.charAt(idx)])
                        hs[s.charAt(idx)]--;
                    idx++;
                }
                int lw = j - idx + 1;
                if(window_length > lw)
                {
                    window_length = lw;
                    window_idx = idx;
                }
            }
        }
        if(window_idx == -1)
        {
            return "";
        } else if(window_length == Integer.MAX_VALUE)
            return "";
        return s.substring(window_idx, window_idx+window_length);
    }

    public String minimumWindow(String s, String t) {
        if(s.length() == 0 || t.length() == 0)
            return "";
        Map<Character, Integer> mapT = new HashMap<>();
        for(int i=0; i<t.length(); i++) {
            int count = mapT.getOrDefault(t.charAt(i), 0);
            count += 1;
            mapT.put(t.charAt(i), count);
        }
        int required = mapT.size();
        int l=0, r=0;
        int formed = 0;
        Map<Character, Integer> window = new HashMap<>();
        int[] result = {-1, 0, 0};

        while(r<s.length()) {
            char c = s.charAt(r);
            int count = window.getOrDefault(c, 0);
            count += 1;
            window.put(c, count);
            if(mapT.containsKey(c) && mapT.get(c).intValue() == window.get(c).intValue())
                formed++;
            while (l<=r && formed == required) {
                c = s.charAt(l);
                if(result[0]==-1 || r-l+1 < result[0]) {
                    result[0] = r-l+1;
                    result[1] = l;
                    result[2] = r;
                }
                count = window.get(c);
                count = count-1;
                window.put(c, count);
                if(mapT.containsKey(c) && mapT.get(c).intValue() > window.get(c).intValue()) {
                    formed--;
                }
                l++;
            }
            r++;
        }
        return result[0] == -1 ? "": s.substring(result[1],result[2]+1);
    }

    public String minWindowLeetCode(String s, String t) {

        if (s.length() == 0 || t.length() == 0) {
            return "";
        }

        // Dictionary which keeps a count of all the unique characters in t.
        Map<Character, Integer> dictT = new HashMap<Character, Integer>();
        for (int i = 0; i < t.length(); i++) {
            int count = dictT.getOrDefault(t.charAt(i), 0);
            dictT.put(t.charAt(i), count + 1);
        }

        // Number of unique characters in t, which need to be present in the desired window.
        int required = dictT.size();

        // Left and Right pointer
        int l = 0, r = 0;

        // formed is used to keep track of how many unique characters in t
        // are present in the current window in its desired frequency.
        // e.g. if t is "AABC" then the window must have two A's, one B and one C.
        // Thus formed would be = 3 when all these conditions are met.
        int formed = 0;

        // Dictionary which keeps a count of all the unique characters in the current window.
        Map<Character, Integer> windowCounts = new HashMap<Character, Integer>();

        // ans list of the form (window length, left, right)
        int[] ans = {-1, 0, 0};

        while (r < s.length()) {
            // Add one character from the right to the window
            char c = s.charAt(r);
            int count = windowCounts.getOrDefault(c, 0);
            windowCounts.put(c, count + 1);

            // If the frequency of the current character added equals to the
            // desired count in t then increment the formed count by 1.
            if (dictT.containsKey(c) && windowCounts.get(c).intValue() == dictT.get(c).intValue()) {
                formed++;
            }

            // Try and contract the window till the point where it ceases to be 'desirable'.
            while (l <= r && formed == required) {
                c = s.charAt(l);
                // Save the smallest window until now.
                if (ans[0] == -1 || r - l + 1 < ans[0]) {
                    ans[0] = r - l + 1;
                    ans[1] = l;
                    ans[2] = r;
                }

                // The character at the position pointed by the
                // `Left` pointer is no longer a part of the window.
                windowCounts.put(c, windowCounts.get(c) - 1);
                if (dictT.containsKey(c) && windowCounts.get(c).intValue() < dictT.get(c).intValue()) {
                    formed--;
                }

                // Move the left pointer ahead, this would help to look for a new window.
                l++;
            }

            // Keep expanding the window once we are done contracting.
            r++;
        }

        return ans[0] == -1 ? "" : s.substring(ans[1], ans[2] + 1);
    }
}
