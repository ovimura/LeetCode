package RemoveOutermostParentheses;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {
    public String removeOuterParentheses(String S) {
        List<String> primitives = new ArrayList<>();
        Stack<String> stack = new Stack<>();
        String primitive = "" + S.charAt(0);
        stack.push(Character.toString(S.charAt(0)));
        int i = 1;
        while(!stack.isEmpty()) {
            String next = Character.toString(S.charAt(i));
            primitive += next;
            if(next.equals(")")) {
                stack.pop();
                if(stack.isEmpty()) {
                    primitives.add(primitive);
                    primitive = "";
                    if(i<S.length()-1) {
                        stack.push("" + S.charAt(i++));
                        primitive += "" + S.charAt(i);
                    }
                }
            } else {
                stack.push(next);
            }
            i++;
        }
        String result = "";
        for(String s: primitives) {
            result += s.substring(1, s.length()-1);
        }
        return result;
    }
}
