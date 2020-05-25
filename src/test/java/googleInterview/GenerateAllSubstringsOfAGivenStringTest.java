package googleInterview;

import GoogleInterview.GenerateAllSubstringsOfAGivenString;
import org.junit.Test;

public class GenerateAllSubstringsOfAGivenStringTest {
    @Test
    public void test1() {
        GenerateAllSubstringsOfAGivenString g = new GenerateAllSubstringsOfAGivenString();
        g.substring("abc");
    }

    @Test
    public void test2() {
        GenerateAllSubstringsOfAGivenString g = new GenerateAllSubstringsOfAGivenString();
        g.substring1("abc");
    }

    @Test
    public void test3() {
        GenerateAllSubstringsOfAGivenString g = new GenerateAllSubstringsOfAGivenString();
        g.allPossibleSubstrings(new char[]{'a','b','c'}, 0, new char[]{});
        // 2^n + empty set -> []
    }

    @Test
    public void test30() {
        GenerateAllSubstringsOfAGivenString g = new GenerateAllSubstringsOfAGivenString();
        // abppplee
        g.allPossibleSubstrings(new char[]{'a','b','p','p','p','l','e','e'}, 0, new char[]{});
        // 2^n + empty set -> []
    }

    @Test
    public void test4() {
        GenerateAllSubstringsOfAGivenString g = new GenerateAllSubstringsOfAGivenString();
        g.printSubsequences(new char[]{'a','b','c'}, 3);
        // 2^n + empty set -> []
    }
}
