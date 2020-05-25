package GoogleInterview;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FindLongestWordInString {

    List<String> generateAllPossibleSubstrings(String S) {
        List<String> result = new ArrayList<>();
        /* Number of subsequences is (2**n -1)*/
        int len = (int)Math.pow(2, S.length());
        /* Run from counter 000..1 to 111..1*/
        for(int i=1; i<len; i++) {
            String word = "";
            for(int j=0; j<S.length(); j++) {
                /* Check if jth bit in the counter is set
                    If set then print jth element from arr[] */
                if((i & (1<<j)) != 0) {
                    word += S.charAt(j);
                }
            }
            result.add(word);
        }
        return result;
    }

    public String findLongestString_bruteforce(String S, List<String> dict) {
        String word = "";
        int max = Integer.MIN_VALUE;
        for(String w: generateAllPossibleSubstrings(S)) {
            for(int i=0; i<dict.size(); i++) {
                if(w.equals(dict.get(i)) && max < w.length())
                        word = w;
            }
        }
        return word;
    }

    public String findLongestString_greedy(String S, List<String> dict) {
        dict.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o1.length()<o2.length())? 1: (o1.length() == o2.length())? 0: -1;
            }
        });
        String word = "";
        for(String w: dict) {
            int count = 0;
            for(int i=0; i<S.length(); i++) {
                if(count==w.length()-1) {
                    word = w;
                    return word;
                } else if(count<w.length() && w.toCharArray()[count]== S.toCharArray()[i]) {
                    count++;
                }
            }
        }
        return word;
    }
}
