import java.util.ArrayDeque;
import java.util.Deque;

public class DecodeString {
    static String decode(String s) {
        Deque<Integer> counts = new ArrayDeque<>();
        Deque<StringBuilder> previous = new ArrayDeque<>();
        StringBuilder current = new StringBuilder();
        int number = 0;

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                number = number * 10 + (ch - '0');
            } else if (ch == '[') {
                counts.push(number);
                previous.push(current);
                current = new StringBuilder();
                number = 0;
            } else if (ch == ']') {
                int times = counts.pop();
                StringBuilder parent = previous.pop();
                for (int i = 0; i < times; i++) parent.append(current);
                current = parent;
            } else {
                current.append(ch);
            }
        }
        return current.toString();
    }

    public static void main(String[] args) {
        System.out.println(decode("3[a2[c]]"));
    }
}
