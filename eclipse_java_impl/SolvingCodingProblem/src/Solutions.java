import java.util.HashMap;
import java.util.Map;

public class Solutions {
    public boolean equalFrequency(String word) {
    	Map<Character, Integer> f = new HashMap<>();
    	if(word.length() <= 2)
    		return true;
    	for(int i=0; i<word.length(); i++) {
    		StringBuilder sb = new StringBuilder(word);
    		sb.deleteCharAt(i);
    		f.clear();
    		for(int j=0; j<sb.length(); j++) {
    			if(f.keySet().contains(sb.charAt(j))) {
    				int v = f.get(sb.charAt(j)) + 1;
    				f.put(sb.charAt(j), v);
    			} else {
    				f.put(sb.charAt(j), 1);
    			}
    		}
    		int tf = f.get(f.keySet().toArray()[0]);
    		int verify = 0;
    		for(Character c: f.keySet()) {
    			if(f.get(c) == tf)
    				verify += 1;
    		}
    		if(verify == f.size())
    			return true;
    	}    	
    	return false;
    }

    public boolean haveConflict(String[] event1, String[] event2) {
    	Integer e1_start = Integer.valueOf(event1[0].split(":")[0])*60 + Integer.valueOf(event1[0].split(":")[1]);
    	Integer e1_end = Integer.valueOf(event1[1].split(":")[0])*60 + Integer.valueOf(event1[1].split(":")[1]);
    	Integer e2_start = Integer.valueOf(event2[0].split(":")[0])*60 + Integer.valueOf(event2[0].split(":")[1]);
    	Integer e2_end = Integer.valueOf(event2[1].split(":")[0])*60 + Integer.valueOf(event2[1].split(":")[1]);
    	if(e1_end >= e2_start && e1_start <= e2_start  || e2_end >= e1_start && e2_start <= e1_start) {
    		return true;
    	}
        return false;
    }
}
