package LengthOfLastWord;

public class Solution {
    public int lengthOfLastWord(String s) {
        String []words = s.split(" ");
        for(int i = words.length-1; i>=0; i--) {
            String temp = words[i].trim();
            if(temp.length() > 0)
                return temp.length();
        }
        return 0;
    }
}
