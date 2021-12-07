package ImplementStackUsingQueues;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class MyStack {

    List<Integer> q;

    public MyStack() {
        q = new ArrayList<>();
    }

    public void push(int x) {
        q.add(0, x);
    }

    public int pop() {
        return q.remove(0);
    }

    public int top() {
        return q.get(0);
    }

    public boolean empty() {
        return q.isEmpty();
    }
}
