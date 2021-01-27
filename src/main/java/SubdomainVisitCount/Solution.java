package SubdomainVisitCount;

import java.util.*;

public class Solution {

    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> map = new HashMap<>();
        for(String s: cpdomains) {
            String[] count = s.split(" ");
            Integer cnt = Integer.valueOf(count[0]);
            System.out.println(count[1].split("\\.")[0]);
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
                System.out.println(k);
                if(!map.keySet().contains(k)) {
                    map.put(k, cnt);
                }
                System.out.println("----------");
            }
        }
        for(String s: map.keySet()) {
            System.out.print(s + ",");
        }
        Set<String> val = map.keySet();
        List<String> result = new ArrayList<>();
        for(int i=val.size()-1; i>-1; i--) {
            result.add(Integer.toString(map.get(val.toArray()[i])) + " " + val.toArray()[i]);
        }
        result.forEach(n-> {
            System.out.println(n);
        });
        return result;
    }

}
