package NumberOfStudentsUnableToEatLunch;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        List<Integer> studs = new ArrayList<>();
        List<Integer> sands = new ArrayList<>();
        for(int st: students)
            studs.add(st);
        for(int sa: sandwiches)
            sands.add(sa);
        int i = students.length * students.length;
        while(studs.size() != 0 && sands.size() != 0 && i != 0) {
            i--;
            int s = studs.remove(0);
            if(s != sands.get(0))
                studs.add(s);
            else if (s == sands.get(0)) {
                sands.remove(0);
            }
        }
        return studs.size();
    }
}
