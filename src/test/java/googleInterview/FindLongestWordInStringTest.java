package googleInterview;

import GoogleInterview.FindLongestWordInString;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class FindLongestWordInStringTest {
    @Test
    public void test1() {
        FindLongestWordInString s = new FindLongestWordInString();
        String letters = "abppplee";
        List<String> words = new ArrayList<>();
        words.add("able");
        words.add("ale");
        words.add("apple");
        words.add("bale");
        words.add("kangaroo");
        Assert.assertEquals("apple", s.findLongestString_bruteforce(letters, words));
    }

    @Test
    public void test2() {
        FindLongestWordInString s = new FindLongestWordInString();
        String letters = "abppplee";
        List<String> words = new ArrayList<>();
        words.add("able");
        words.add("ale");
        words.add("apple");
        words.add("bale");
        words.add("kangaroo");
        Assert.assertEquals("apple", s.findLongestString_greedy(letters, words));
    }
}
