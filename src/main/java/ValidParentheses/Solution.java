package ValidParentheses;

import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++) {
            if(stack.isEmpty())
                stack.push(s.charAt(i));
            else {
                Character c = stack.peek();
                if(c == '(' && s.charAt(i) == ')')
                    stack.pop();
                else if (c == '[' && s.charAt(i) == ']')
                    stack.pop();
                else if (c == '{' && s.charAt(i) == '}')
                    stack.pop();
                else
                    stack.push(s.charAt(i));
            }
        }
        return stack.isEmpty()?true:false;
    }
}
