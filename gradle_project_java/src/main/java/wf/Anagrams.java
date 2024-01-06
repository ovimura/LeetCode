package wf;

import java.util.*;


public class Anagrams {

/*
    You have a list of anagrams

    {"cat", "act", "god", "tac", "dog"}

    You need to group the anagrams

    {"cat", "act", "tac", "god", "dog"}
*/

    public static Set<String> anagrams(String[] words) {
        Set<String> result = new HashSet<>();
        Map<String,List<Character>> map = new HashMap<>();

        for(int i=0; i<words.length; i++) {
            List<Character> letters = new ArrayList<>();
            for(int j=0; j<words[i].length(); j++)
                letters.add(words[i].toCharArray()[j]);
            map.put(words[i], letters);
        }
        for(String k: map.keySet()) {
            char[] ls = k.toCharArray();
            Set<String> keys = map.keySet();
            for(String s: keys) {
                Set<String> temp = new HashSet<>();
                if(!k.equals(s)) {
                    List<Character> chrs = map.get(s);
                    for(int z=0; z<k.length(); z++) {
                        if(chrs.contains(k.toCharArray()[z])) {
                            temp.add(s);
                        }
                    }
                }
                temp.forEach(n->{
                    result.add(n);
                });
            }
        }
        return result;
    }

    public static List<String> anagramss(String[] words) {
        List<String> result = new ArrayList();
        Map<String,List<String>> map = new HashMap<>();

        for(String w: words) {
            char[] letters = w.toCharArray();
            Arrays.sort(letters);
            String key = String.valueOf(letters);
            map.put(key, new ArrayList<>());
        }
        for(int i=0; i<words.length; i++) {
            char[] letters = words[i].toCharArray();
            Arrays.sort(letters);
            for(String s: map.keySet()) {
                if (String.valueOf(letters).equals(s)) {
                    List<String> tmp = map.get(s);
                    tmp.add(words[i]);
                    map.put(s, tmp);
                }
            }
        }
        map.keySet().forEach(n-> {
            map.get(n).forEach(m -> {
                result.add(m);
            });
        });
        return result;
    }

    public static void main(String [] args) {
        Set<String> rs = anagrams(new String[]{"cat", "act", "god", "tac", "dog"});
        rs.forEach(it -> {
            System.out.print(it + ",");
        });
    }


}
