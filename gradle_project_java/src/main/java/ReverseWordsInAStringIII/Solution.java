package ReverseWordsInAStringIII;

public class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        String result = "";
        for(int i=0; i<words.length; i++) {
            char[] cs = words[i].toCharArray();
            for(int j=0; j<cs.length/2; j++) {
                char c = cs[j];
                cs[j] = cs[cs.length - 1 - j];
                cs[cs.length - 1 - j] = c;
            }
            if(i == words.length-1)
                result = result.concat(new String(cs));
            else
                result = result.concat(new String(cs) + " ");
        }
        return result;
    }

    public String reverseWords1(String s) {
        char[] ca = s.toCharArray();
        for (int i = 0; i < ca.length; i++) {
            if (ca[i] != ' ') {
                int j = i;
                while (j + 1 < ca.length && ca[j + 1] != ' ') { j++; }
                reverse(ca, i, j);
                i = j;
            }
        }
        return new String(ca);
    }

    private void reverse(char[] ca, int i, int j) {
        for (; i < j; i++, j--) {
            char tmp = ca[i];
            ca[i] = ca[j];
            ca[j] = tmp;
        }
    }
}
