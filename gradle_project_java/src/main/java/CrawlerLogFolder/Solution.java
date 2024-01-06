package CrawlerLogFolder;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int minOperations(String[] logs) {
        List<String> commands = new ArrayList<>();
        for(String l: logs) {
            if(l.equals("../")) {
                if(commands.size() != 0) {
                    String cur = commands.get(commands.size()-1);
                    String[] folders = cur.split("/");
                    StringBuilder temp = new StringBuilder();
                    for(int i=0; i<folders.length-1; i++) {
                        temp.append(folders[i]);
                        temp.append("/");
                    }
                    commands.add(temp.toString());
                }
            } else if (l.equals("./")) {
                continue;
            } else {
                String cur = "";
                if(commands.size()>0)
                    cur = commands.get(commands.size()-1);
                String temp = cur + l;
                commands.add(temp);
            }
        }
        if(commands.size()>0) {
            String[] ss = commands.get(commands.size()-1).split("/");
            if(ss.length == 1 && ss[0].equals(""))
                return 0;
            return commands.get(commands.size() - 1).split("/").length;
        } else
            return 0;
    }
}
