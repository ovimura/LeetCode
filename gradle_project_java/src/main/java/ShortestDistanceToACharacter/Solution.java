package ShortestDistanceToACharacter;

public class Solution {
    public int[] shortestToChar(String s, char c) {
        int[] answer = new int[s.length()];
        char[] str = s.toCharArray();
        for(int i=0; i< answer.length; i++) {
            int l = i, r =i;
            while(l >= 0 && str[l] != c)
                l--;
            while(r < str.length && str[r] != c)
                r++;
            int tl = Math.abs(i - l);
            int tr = Math.abs(r - i);
            if(l<0)
                answer[i] = tr;
            else if(r >= str.length)
                answer[i] = tl;
            else
                answer[i] = Math.min(tl, tr);
        }
        return answer;
    }
}
