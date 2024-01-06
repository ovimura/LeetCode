package CheckIfAWordOccursAsAPrefixOfAnyWordInASentence;

public class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String [] words = sentence.split(" ");
        int i = 1;
        for(String w: words) {
            if(w.length() >= searchWord.length() && w.startsWith(searchWord)) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
