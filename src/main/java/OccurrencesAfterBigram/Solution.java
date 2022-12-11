package OccurrencesAfterBigram;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        String[] words = text.split(" ");
        List<String> ocurr = new ArrayList<>();
        String prev = "", curr = "";
        for(int i=0; i<words.length-2; i++) {
            if(words[i].equals(first) && words[i+1].equals(second)) {
                ocurr.add(words[i+2]);
            }

        }
        return ocurr.toArray(new String[]{});
    }
}
