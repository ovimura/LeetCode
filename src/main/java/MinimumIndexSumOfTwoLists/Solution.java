package MinimumIndexSumOfTwoLists;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, List<Integer>>  m = new HashMap<>();
        List<String> res = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        int i=0, j=0;
        for(String l1: list1) {
            j=0;
            for(String l2: list2) {
                if(l1.equals(l2)) {
                    if(min > i+j)
                        min = i+j;
                    if(m.containsKey(l1)) {
                        List<Integer> tmp = m.get(l1);
                        tmp.add(i+j);
                        m.put(l1, tmp);
                    } else {
                        List<Integer> tmp = new ArrayList<>();
                        tmp.add(i+j);
                        m.put(l1, tmp);
                    }
                }
                j++;
            }
            i++;
        }
        for(String key: m.keySet()) {
            if(m.get(key).contains(min)) {
                res.add(key);
            }
        }
        return res.toArray(new String[0]);
    }

    public String[] findRestaurant_sol1(String[] list1, String[] list2) {
        HashMap < Integer, List < String >> map = new HashMap < > ();
        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list2.length; j++) {
                if (list1[i].equals(list2[j])) {
                    if (!map.containsKey(i + j))
                        map.put(i + j, new ArrayList < String > ());
                    map.get(i + j).add(list1[i]);
                }
            }
        }
        int min_index_sum = Integer.MAX_VALUE;
        for (int key: map.keySet())
            min_index_sum = Math.min(min_index_sum, key);
        String[] res = new String[map.get(min_index_sum).size()];
        return map.get(min_index_sum).toArray(res);
    }
}
