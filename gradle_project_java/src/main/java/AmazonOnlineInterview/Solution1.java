package AmazonOnlineInterview;

import org.omg.CORBA.INTERNAL;

import java.util.*;

public class Solution1 {
    public List<String> retrieveMostFrequentlyUsedWords(String helpText, List<String> wordsToExclude) {
        List<String> res= new ArrayList<>();
        String[] words = helpText.split("\\s+|,|\'|\\.");
        Map<String, Integer> freq = new HashMap<>();
        for(int j=0; j<words.length; j++) {
            boolean exlude = false;
            for (int i = 0; i < wordsToExclude.size(); i++) {
                if (words[j].toLowerCase().equals(wordsToExclude.get(i).toLowerCase())) {
                    exlude = true;
                }
            }
            if(exlude == false)
                res.add(words[j].toLowerCase());
        }
        res.forEach(n-> {
                int f = freq.getOrDefault(n, 0);
                freq.put(n, f+1);
        });
        int max = Integer.MIN_VALUE;
        for(String k: freq.keySet()) {
            if(max < freq.get(k))
                max = freq.get(k);
        }
        List<String> result = new ArrayList<>();
        for(String k: freq.keySet()) {
            if(max == freq.get(k))
                result.add(k);
        }
        return result;
    }
}
