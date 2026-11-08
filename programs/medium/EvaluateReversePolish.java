import java.util.*;

public class EvaluateReversePolish {
    static int calculate(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (String s : tokens) {
            if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
                int b = stack.pop(), a = stack.pop();
                if (s.equals("+")) stack.push(a + b);
                else if (s.equals("-")) stack.push(a - b);
                else if (s.equals("*")) stack.push(a * b);
                else stack.push(a / b);
            } else {
                stack.push(Integer.parseInt(s));
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        System.out.println(calculate(new String[]{"2", "1", "+", "3", "*"}));
    }
}
