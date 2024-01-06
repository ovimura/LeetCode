package FindWinnerOnATicTacToeGame;

public class Solution {
    public String tictactoe(int[][] moves) {
        char[][] tictactoe = new char[3][3];
        int turn = 0;
        for(int[] m: moves) {
            if(tictactoe[m[0]][m[1]] == 0) {
                if(turn % 2 == 0) {
                    tictactoe[m[0]][m[1]] = 'X';
                } else {
                    tictactoe[m[0]][m[1]] = 'O';
                }
            }
            turn++;
        }
        int zeros = 0;
        for(char[] a: tictactoe) {
            if(a[0] == 0 || a[1] == 0 || a[2] == 0) {
                zeros++;
            }
        }
        if((tictactoe[0][0] == 'X' || tictactoe[0][0] == 'O') &&
                (tictactoe[0][0] == tictactoe[0][1] && tictactoe[0][0] == tictactoe[0][2])) {
            if(tictactoe[0][0] == 'X')
                return "A";
            else
                return "B";
        }
        if((tictactoe[1][0] == 'X' || tictactoe[1][0] == 'O') &&
                (tictactoe[1][0] == tictactoe[1][1] && tictactoe[1][0] == tictactoe[1][2])) {
            if(tictactoe[1][0] == 'X')
                return "A";
            else
                return "B";
        }
        if((tictactoe[2][0] == 'X' || tictactoe[2][0] == 'O') &&
                (tictactoe[2][0] == tictactoe[2][1] && tictactoe[2][0] == tictactoe[2][2])) {
            if(tictactoe[2][0] == 'X')
                return "A";
            else
                return "B";
        }
        if((tictactoe[0][0] == 'X' || tictactoe[0][0] == 'O') &&
                (tictactoe[0][0] == tictactoe[1][0] && tictactoe[0][0] == tictactoe[2][0])) {
            if(tictactoe[0][0] == 'X')
                return "A";
            else
                return "B";
        }
        if((tictactoe[0][1] == 'X' || tictactoe[0][1] == 'O') &&
                (tictactoe[0][1] == tictactoe[1][1] && tictactoe[0][1] == tictactoe[2][1])) {
            if(tictactoe[0][1] == 'X')
                return "A";
            else
                return "B";
        }
        if((tictactoe[0][2] == 'X' || tictactoe[0][2] == 'O') &&
                (tictactoe[0][2] == tictactoe[1][2] && tictactoe[0][2] == tictactoe[2][2])) {
            if(tictactoe[0][2] == 'X')
                return "A";
            else
                return "B";
        }
        if((tictactoe[0][0] == 'X' || tictactoe[0][0] == 'O') &&
                (tictactoe[0][0] == tictactoe[1][1] && tictactoe[0][0] == tictactoe[2][2])) {
            if(tictactoe[0][0] == 'X')
                return "A";
            else
                return "B";
        }
        if((tictactoe[0][2] == 'X' || tictactoe[0][2] == 'O') &&
                (tictactoe[0][2] == tictactoe[1][1] && tictactoe[0][2] == tictactoe[2][0])) {
            if(tictactoe[0][2] == 'X')
                return "A";
            else
                return "B";
        }
        if(zeros>0)
            return "Pending";
        return "Draw";
    }
}
