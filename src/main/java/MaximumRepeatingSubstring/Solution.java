package MaximumRepeatingSubstring;

public class Solution {
    public int maxRepeating(String sequence, String word) {
        int count = 0;
        if(word.length()> sequence.length())
            return count;
        else if(sequence.equals(word))
            return 1;
        for(int j=0; j<=sequence.length()-word.length(); j++) {
            int tc = 0;
            for (int i = j; i <= sequence.length() - word.length(); i++) {
                if (sequence.substring(i, i + word.length()).equals(word)) {
                    tc++;
                    i = i + word.length() - 1;
                } else {
                    if(tc > count)
                        count = tc;
                    tc = 0;
                }
            }
            if(tc>count)
                count = tc;
        }
        return count;
    }
}
