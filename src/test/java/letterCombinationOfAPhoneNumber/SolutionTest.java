package letterCombinationOfAPhoneNumber;

import LetterCombinationOfAPhoneNumber.Solution;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        System.out.println(s.letterCombinations("23"));
        System.out.println(s.letterCombinations("2"));
    }
}
