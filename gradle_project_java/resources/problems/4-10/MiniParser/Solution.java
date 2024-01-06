public class Solution {
    public NestedInteger deserialize(String s) {
        Stack<NestedInteger> stack = new Stack<>();
        StringBuilder value = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c == '[') {
                stack.push(new NestedInteger());
            }else if (c == ']') {
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
            } else if(c == ',') {
                if (value.length() > 0) {
                    stack.peek().add(new NestedInteger(Integer.parseInt(value.toString())));
                    value = value.delete(0, value.length());
                }
            } else {
                value.append(c);
            }
        }
        if(value.length()>0){
            return new NestedInteger(Integer.parseInt(value.toString()));
        }
        return null;
    }
}