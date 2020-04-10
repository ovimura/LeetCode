package MiniParser;

import java.util.List;
import java.util.Stack;


public class Sol {
    public Nested deserialize(String s) {
        Stack<NestedInteger> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            switch(c){
                case '[':
                    NestedInteger ni = new NestedInteger();
                    stack.push(ni);
                    break;

                case ']':
                    if(sb.length()>0){ //123, not [456],
                        stack.peek().add(new NestedInteger(Integer.parseInt(sb.toString())));
                        sb=sb.delete(0, sb.length());
                    }

                    NestedInteger top = stack.pop();
                    if(stack.isEmpty()){
                        return top;
                    }else{
                        stack.peek().add(top);
                    }

                    break;
                case ',':
                    if(sb.length()>0){ //hande case "123," not "[456],"
                        stack.peek().add(new NestedInteger(Integer.parseInt(sb.toString())));
                        sb=sb.delete(0, sb.length());
                    }

                    break;

                default: //digits
                    sb.append(c);
            }
        }

        //handle case "123"
        if(sb.length()>0){
            return new NestedInteger(Integer.parseInt(sb.toString()));
        }

        return null;
    }
}
