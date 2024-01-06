package MaximumNumberOfWordsYouCanType;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] words = text.split(" ");
        List<String> typedWords = new ArrayList<>();
        for(String w: words) {
            int count = 0;
            for(char c: brokenLetters.toCharArray()) {
                for(char cw : w.toCharArray()) {
                    if(c == cw) {
                        count++;
                    }
                }
            }
            if(count == 0) {
                typedWords.add(w);
            }
        }
        return typedWords.size();
    }
}
