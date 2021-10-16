package MinStack;

import java.util.ArrayList;
import java.util.List;

public class MinStack {
    private List<Integer> stack;

    public MinStack() {
        stack = new ArrayList<>();
    }

    public void push(int val) {
        stack.add(val);
    }

    public void pop() {
        stack.remove(stack.size()-1);
    }

    public int top() {
        return stack.get(stack.size()-1);
    }

    public int getMin() {
        int min = Integer.MAX_VALUE;
        for(int i=0; i<stack.size(); i++) {
            if(stack.get(i) < min)
                min = stack.get(i);
        }
        return min;
    }
}
