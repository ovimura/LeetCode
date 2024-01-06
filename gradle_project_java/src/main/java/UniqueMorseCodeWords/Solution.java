package UniqueMorseCodeWords;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        Set<String> result = new HashSet<>();
        String[] morse = new String[] {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        for(String w: words) {
            String m = "";
            for(int i=0; i<w.length(); i++)
                m += morse[w.charAt(i) - 'a'];
            result.add(m);
        }
        return result.size();
    }
}
