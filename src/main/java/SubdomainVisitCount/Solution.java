package SubdomainVisitCount;

import java.util.*;

public class Solution {

    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> map = new HashMap<>();
        for(String s: cpdomains) {
            String[] count = s.split(" ");
            Integer cnt = Integer.valueOf(count[0]);
            String[] ds = count[1].split("\\.");
            for(int i=0; i<ds.length; i++) {
                int j=i;
                String k = "";
                while(j<ds.length) {
                    k = k.concat(ds[j]);
                    if(j != ds.length-1)
                        k = k.concat(".");
                    j++;
                }
                if(!map.keySet().contains(k)) {
                    map.put(k, cnt);
                } else {
                    int temp = map.get(k);
                    map.put(k, cnt+temp);
                }
            }
        }
        Set<String> val = map.keySet();
        List<String> result = new ArrayList<>();
        for(int i=val.size()-1; i>-1; i--) {
            result.add(Integer.toString(map.get(val.toArray()[i])) + " " + val.toArray()[i]);
        }
        return result;
    }
}
