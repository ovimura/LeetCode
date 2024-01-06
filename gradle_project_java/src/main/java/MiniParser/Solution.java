package MiniParser;

/* Given a nested list of integers represented as a string, implement a parser to deserialize it.

        Each element is either an integer, or a list -- whose elements may also be integers or other lists.

        Note: You may assume that the string is well-formed:

        String is non-empty.
        String does not contain white spaces.
        String contains only digits 0-9, [, - ,, ].
        Example 1:

        Given s = "324",

        You should return a NestedInteger object which contains a single integer 324.
        Example 2:

        Given s = "[123,[456,[789]]]",

        Return a NestedInteger object containing a nested list with 2 elements:

        1. An integer containing value 123.
        2. A nested list containing two elements:
        i.  An integer containing value 456.
        ii. A nested list with one element:
        a. An integer containing value 789. */

import java.util.Stack;

public class Solution {

    public NestedInteger deserialize(String s) {
        Stack<NestedInteger> stack = new Stack<>();
        StringBuilder value = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c == '[') {
                stack.push(new NestedInteger());
            }else if (c == ']') { //123, not [456],
                if (value.length() > 0) {
                    stack.peek().add(new NestedInteger(Integer.parseInt(value.toString())));
                    value = value.delete(0, value.length());
                }
                NestedInteger top = stack.pop();
                if (stack.isEmpty()) {
                    return top;
                } else {
                    stack.peek().add(top);
                }
            } else if(c == ',') { // handle case "123," not "[456],"
                if (value.length() > 0) {
                    stack.peek().add(new NestedInteger(Integer.parseInt(value.toString())));
                    value = value.delete(0, value.length());
                }
            } else { // digits
                value.append(c);
            }
        }
        if(value.length()>0){ // handle case "123"
            return new NestedInteger(Integer.parseInt(value.toString()));
        }
        return null;
    }
}