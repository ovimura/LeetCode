package RearrangeSpacesBetweenWords;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public String reorderSpaces(String text) {
        int spaces = 0, words = 0;
        boolean wStart = false;
        char prev = '-';
        List<String> dict = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        char[] chars = text.toCharArray();
        for(int i=0; i<text.length(); i++) {
            char c = chars[i];
            if(c == ' ') {
                spaces++;
                if(prev != ' ') {
                    wStart = false;
                    if(sb.length() > 0) {
                        dict.add(sb.toString());
                        sb = new StringBuilder();
                    }
                }
            } else if(!wStart) {
                words++;
                wStart = true;
            }
            if(wStart) {
                sb.append(c);
                if(i == text.length()-1)
                    dict.add(sb.toString());
            }
            prev = c;
        }
        StringBuilder sentence = new StringBuilder();
        if(spaces == words-1) {
            for(int i=0; i<dict.size(); i++) {
                sentence.append(dict.get(i));
                if(i<dict.size()-1)
                    sentence.append(' ');
            }
        } else if (spaces == words) {
            for (String w : dict) {
                sentence.append(w);
                sentence.append(' ');
            }
        } else if (spaces > words) {
            if(words == 1)
            {
                for(int i=0; i<dict.size(); i++) {
                    sentence.append(dict.get(i));
                    if(i<dict.size()-1)
                        for(int j=0; j<spaces; j++) {
                            sentence.append(' ');
                        }
                }
                for(int i=0; i<spaces; i++) {
                    sentence.append(' ');
                }
                return sentence.toString();
            }
            int[] gs = new int[3];
            gs[0] = spaces % (words-1);
            gs[1] = spaces % (words);
            gs[2] = spaces % (words+1);

            int n1 = (spaces - gs[0])/(words-1);
            int n2 = (spaces - gs[1])/(words);
            int n3 = (spaces - gs[2])/(words+1);
            if(n1>=n2 && n1 >= n3) {
                int nspaces = (spaces - gs[0]) / (words - 1);
                for (int i = 0; i < dict.size(); i++) {
                    sentence.append(dict.get(i));
                    if (i < dict.size() - 1)
                        for (int j = 0; j < nspaces; j++) {
                            sentence.append(' ');
                        }
                }
                for (int i = 0; i < gs[0]; i++) {
                    sentence.append(' ');
                }
            } else if(n2>=n1 && n2 >= n3) {
                int nspaces = (spaces - gs[1])/(words);
                for (String s : dict) {
                    sentence.append(s);
                    for (int j = 0; j < nspaces; j++) {
                        sentence.append(' ');
                    }
                }
                for(int i=0; i<gs[1]; i++) {
                    sentence.append(' ');
                }
            } else {
                int nspaces = (spaces - gs[2])/(words);
                for (String s : dict) {
                    sentence.append(s);
                    for (int j = 0; j < nspaces; j++) {
                        sentence.append(' ');
                    }
                }
                for(int i=0; i<nspaces; i++) {
                    sentence.append(' ');
                }
            }
        }
        return sentence.toString();
    }
}
