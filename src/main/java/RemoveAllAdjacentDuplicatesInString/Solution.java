package RemoveAllAdjacentDuplicatesInString;

import java.util.Stack;

public class Solution {
    public String removeDuplicates(String S) {
        Stack<Character> stack = new Stack<>();
        for(Character c: S.toCharArray()) {
            if(!stack.isEmpty()) {
                Character top = stack.pop();
                if (top != c) {
                    stack.push(top);
                    stack.push(c);
                }
            } else
                stack.push(c);
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb = new StringBuilder(stack.pop().toString()).append(sb);;
        }
        return sb.toString();
    }
}
