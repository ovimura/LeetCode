package DetectCapital;

public class Solution {
    public boolean detectCapitalUse(String word) {
        int lowerCase = 0;
        int upperCase = 0;
        for(char c: word.toCharArray()) {
            if(Character.isUpperCase(c))
                upperCase++;
            else
                lowerCase++;
        }
        if(upperCase==1 && Character.isUpperCase(word.toCharArray()[0]))
            return true;
        else if(upperCase == word.length())
            return true;
        else if(lowerCase == word.length())
            return true;
        return false;
    }
}
