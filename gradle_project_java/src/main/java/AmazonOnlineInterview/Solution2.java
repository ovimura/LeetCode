package AmazonOnlineInterview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution2 {
    public List<Integer> lengthEachScene(List<Character> inputList)
    {
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i<inputList.size(); i++) {
            map.put(inputList.get(i), i);
        }
        List<Integer> result = new ArrayList<>();
        int l = 0, r = 0;
        for(int i=0; i<inputList.size(); i++) {
            r = Math.max(r, map.get(inputList.get(i)));
            if(r == i)
            {
                result.add(1+r-l);
                l = r+1;
            }
        }
        return result;
    }
}
