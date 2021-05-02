package KeyboardRow;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public String[] findWords(String[] words) {
        List<String> rs = new ArrayList<>();
        String[] keyboard = new String[]{"qwertyuiop","asdfghjkl","zxcvbnm"};
        boolean not_the_same_line = false;
        for(String w: words) {
            int line = -1;
            for(int i=0; i<w.length(); i++) {
                not_the_same_line = false;
                for(int z=0; z<keyboard.length; z++) {
                    if(keyboard[z].contains(Character.toString(w.charAt(i)))) {
                        if(line != z && line != -1) {
                            not_the_same_line = true;
                            break;
                        } else
                            line = z;
                    }
                }
                if(not_the_same_line)
                    break;
            }
            if(!not_the_same_line)
                rs.add(w);
        }
        return rs.stream().toArray(String[]::new);
    }
}
