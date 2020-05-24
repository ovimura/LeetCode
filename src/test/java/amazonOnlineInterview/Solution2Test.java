package amazonOnlineInterview;

import AmazonOnlineInterview.Solution2;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Solution2Test {
    @Test
    public void test1() {
        Solution2 s2 = new Solution2();
        List<Character> input = new ArrayList<>();
        input.add('a');
        input.add('b');
        input.add('c');
        input.add('d');
        input.add('a');
        input.add('e');
        input.add('f');
        input.add('g');
        input.add('h');
        input.add('i');
        input.add('j');
        input.add('e');
        List<Integer> li = s2.lengthEachScene(input);
        li.forEach(n-> {
            System.out.println(n);
        });
    }
}
