public class StackUsingArray {
    int[] stack = new int[5];
    int top = -1;

    void push(int value) {
        if (top == stack.length - 1) {
            System.out.println("Stack is full");
            return;
        }
        stack[++top] = value;
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Removed " + stack[top--]);
    }

    void peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Top: " + stack[top]);
        }
    }

    public static void main(String[] args) {
        StackUsingArray s = new StackUsingArray();
        s.push(10);
        s.push(20);
        s.push(30);
        s.peek();
        s.pop();
        s.peek();
    }
}
