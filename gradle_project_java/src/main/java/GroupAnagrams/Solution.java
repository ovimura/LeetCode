package GroupAnagrams;

import java.util.*;

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0)
            return new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for(String s: strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String k = String.valueOf(chars);
            if(!map.containsKey(k)) {
                map.put(k, new ArrayList<>());
            }
            map.get(k).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
