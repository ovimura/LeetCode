package GoogleInterview;

import java.util.*;

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

    public String findLongestString_improve_greedy(String S, List<String> dict) {
        dict.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o1.length()<o2.length())? 1: (o1.length() == o2.length())? 0: -1;
            }
        });
        Map<String, List<Integer>> map = new HashMap<>();
        List<Integer> integers;
        for(int i=0; i<S.length(); i++) {
            integers = map.getOrDefault(String.valueOf(S.charAt(i)), new ArrayList<>());
            integers.add(i);
            map.put(String.valueOf(S.charAt(i)), integers);
        }
        for(String word: dict) {
            int pos = 0;
            boolean flag = false;
            for(int i=0; i<word.length(); i++) {
                if(!map.keySet().contains(String.valueOf(word.charAt(i)))) {
                    flag = true;
                    break;
                }
                List<Integer> possible_positions = new ArrayList<>();
                if(map.get(String.valueOf(word.charAt(i)))!= null)
                    for(Integer p: map.get(String.valueOf(word.charAt(i)))) {
                        if(p >= pos)
                            possible_positions.add(p);
                    }
                if(possible_positions.size() == 0) {
                    flag = true;
                    break;
                }
                pos = possible_positions.get(0)+1;
            }
            if(flag == false)
                return word;
        }
        return "";
    }
}
