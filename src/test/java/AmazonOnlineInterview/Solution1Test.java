package amazonOnlineInterview;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Solution1Test {
    @Test
    public void test1() {
        Solution1 s1 = new Solution1();
        List<String> wordsToExclude = new ArrayList<>();
        wordsToExclude.add("is");
        wordsToExclude.add("are");
        wordsToExclude.add("a");
        String str= "Rose is a flower red rose are flower ";
        List<String> res = s1.retrieveMostFrequentlyUsedWords(str, wordsToExclude);
        System.out.println("))))))))))))))");
        res.forEach(n-> {
            System.out.println(n);
        });
    }

    @Test
    public void test2() {
        Solution1 s1 = new Solution1();
        List<String> wordsToExclude = new ArrayList<>();
        wordsToExclude.add("and");
        wordsToExclude.add("he");
        wordsToExclude.add("the");
        wordsToExclude.add("to");
        wordsToExclude.add("is");
        String str= "Jack and Jill went to the market to buy bread and cheese. Cheese is Jack's and Jill's favorite food.";
        List<String> res = s1.retrieveMostFrequentlyUsedWords(str, wordsToExclude);
        System.out.println("))))))))))))))");
        res.forEach(n-> {
            System.out.println(n);
        });
    }
}
