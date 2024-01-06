package FindResultantArrayAfterRemovingAnagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> final_words = new ArrayList<>();
        int anagrams = 1;
        int i= 0;
        for(i=0; i<words.length; i++) {
            final_words.add(words[i]);
        }
        while(anagrams != 0) {
            anagrams = 0;
            if(final_words.size()>1)
                for(i=1; i<final_words.size(); i++) {
                    char[] w1 = final_words.get(i).toCharArray();
                    char[] w2 = final_words.get(i-1).toCharArray();
                    Arrays.sort(w1);
                    Arrays.sort(w2);
                    if(Arrays.equals(w1, w2)) {
                        final_words.remove(i);
                        anagrams++;
                    }
                }
        }
        return final_words;
    }
}
