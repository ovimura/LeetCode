package IncreasingDecreasingString;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public String sortString(String s) {
        Character[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        Character[] reversed_alphabet = {'z','y','x','w','v','u','t','s','r','q','p','o','n','m','l','k','j','i','h','g','f','e','d','c','b','a'};
        StringBuilder result = new StringBuilder();
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++) {
            int count = map.getOrDefault(s.charAt(i),0);
            map.put(s.charAt(i),count+1);
        }
        while(result.length() < s.length()) {
            for (Character c : alphabet) {
                if (map.containsKey(c)) {
                    if (map.get(c).intValue() > 0) {
                        int val = map.get(c).intValue();
                        result.append(c);
                        map.put(c, val - 1);
                    }
                }
            }
            for (Character c : reversed_alphabet) {
                if (map.containsKey(c)) {
                    if (map.get(c).intValue() > 0) {
                        int val = map.get(c).intValue();
                        result.append(c);
                        map.put(c, val - 1);
                    }
                }
            }
        }
        return result.toString();
    }
}
