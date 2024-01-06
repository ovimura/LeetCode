package DivisorGame;

public class Solution {
    public boolean divisorGame(int n) {
        int i = 1;
        boolean Amove = false;
        boolean Bmove = false;
        while(true) {
            Amove = false;
            for (i = 1; i < n; i++) {
                if (n % i == 0) {
                    Amove = true;
                    break;
                }
            }
            if(Amove == false)
                return false;
            n = n - i;
            Bmove = false;
            for (i = 1; i < n; i++) {
                if (n % i == 0) {
                    Bmove = true;
                    break;
                }
            }
            n = n - i;
            if(Bmove == false && Amove == true) {
                return true;
            } else if(Bmove == false && Amove == false) {
                return false;
            }
        }
    }
}
