package OneBitAndTwoBitCharacters;

public class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        boolean one = true;
        for(int i=0; i<bits.length; i++) {
            one = true;
            if(bits[i] == 1){
                i++;
                one = false;
            }
        }
        return one;
    }
}
