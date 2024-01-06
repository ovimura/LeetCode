package DestinationCity;

import java.util.List;

public class Solution {
    public String destCity(List<List<String>> paths) {
        String destination = paths.get(0).get(1);
        boolean next = true;
        while(next){
            next = false;
            for (List<String> path: paths) {
                if(path.get(0).equals(destination)) {
                    destination = path.get(1);
                    next = true;
                }
            }
        }
        return destination;
    }
}
