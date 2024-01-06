package CountTheNumberOfConsistentStrings;

public class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int [] s1 = new int[26];
        int [] s2;
        int count = 0;
        for(int i=0; i<allowed.length(); i++) {
            s1[allowed.charAt(i)-'a']++;
        }
        for(String w: words) {
            s2 = new int[26];
            for(int j=0; j<w.length(); j++) {
                s2[w.charAt(j)-'a']++;
            }
            boolean f = false;
            for(int i=0; i<26; i++) {
                if(s1[i] == 0 && s2[i] != 0) {
                    f = true;
                    break;
                }
            }
            if(!f)
                count++;
        }
        return count;
    }
}
