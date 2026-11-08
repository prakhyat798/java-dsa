import java.util.*;

public class MinStackExample {
    static class MinStack {
        Deque<int[]> stack = new ArrayDeque<>();

        void push(int value) {
            int min = stack.isEmpty() ? value : Math.min(value, stack.peek()[1]);
            stack.push(new int[]{value, min});
        }

        int pop() { return stack.pop()[0]; }
        int top() { return stack.peek()[0]; }
        int getMin() { return stack.peek()[1]; }
    }

    public static void main(String[] args) {
        MinStack s = new MinStack();
        s.push(4); s.push(2); s.push(5);
        System.out.println(s.getMin());
        s.pop();
        System.out.println(s.top() + " " + s.getMin());
    }
}
