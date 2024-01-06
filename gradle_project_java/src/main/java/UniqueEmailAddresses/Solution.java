package UniqueEmailAddresses;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> rs = new HashSet<>();
        for(String e: emails) {
            String local = e.split("@")[0];
            String domain = e.split("@")[1];
            String tmp = "";
            if(local.contains("+")) {
                if(local.indexOf("+") != -1)
                    tmp = local.substring(0,local.indexOf("+"));
                else
                    tmp = local;
                if(tmp.contains(".")) {
                    StringBuilder sb = new StringBuilder();
                    for(Character c: tmp.toCharArray())
                        if(c != '.')
                            sb.append(c);
                    tmp = sb.toString();
                }
                rs.add(tmp + "@" + domain);
            } else {
                tmp = local;
                if(tmp.contains(".")) {
                    StringBuilder sb = new StringBuilder();
                    for(Character c: tmp.toCharArray())
                        if(c != '.')
                            sb.append(c);
                    tmp = sb.toString();
                }
                rs.add(tmp + "@" + domain);
            }
        }
        return rs.size();
    }
}
