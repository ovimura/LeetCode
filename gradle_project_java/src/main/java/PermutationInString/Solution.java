package PermutationInString;

public class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if(s1.length() > s2.length()){
            return false;
        }

        int[] s1Data = new int[26];
        int[] s2Data = new int[26];

        for(int i=0;i<s1.length();i++){
            s1Data[s1.charAt(i) - 'a']++;
            s2Data[s2.charAt(i) - 'a']++;
        }

        int windowStart = 0;
        int windowEnd = s1.length();

        while(windowEnd < s2.length()){
            if(matches(s1Data, s2Data)){
                return true;
            }

            s2Data[s2.charAt(windowEnd) - 'a']++;
            s2Data[s2.charAt(windowStart) - 'a']--;

            windowStart++;
            windowEnd++;

        }
        if(matches(s1Data, s2Data)){
            return true;
        }
        return false;
    }

    public boolean matches(int[] s1Data, int[] s2Data){
        for(int i = 0; i < 26; i++){
            if(s1Data[i] != s2Data[i]){
                return false;
            }
        }
        return true;
    }
}
