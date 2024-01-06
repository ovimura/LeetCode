package GoalParserInterpretation;

public class Solution {
    public String interpret(String command) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<command.length(); i++) {
            if(command.charAt(i) == 'G') {
                sb.append('G');
            } else if(command.charAt(i) == '(') {
                if (command.charAt(i + 1) == ')') {
                    sb.append('o');
                    i++;
                } else if((i+3 < command.length()) && command.charAt(i+1) == 'a'
                        && command.charAt(i+2) == 'l' && command.charAt(i+3) == ')') {
                    sb.append("al");
                    i += 3;
                }
            }
        }
        return sb.toString();
    }
}
