import java.util.*;

public class DailyTemperatures {
    public static void main(String[] args) {
        int[] temp = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] days = new int[temp.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < temp.length; i++) {
            while (!stack.isEmpty() && temp[i] > temp[stack.peek()]) {
                int old = stack.pop();
                days[old] = i - old;
            }
            stack.push(i);
        }

        System.out.println(Arrays.toString(days));
    }
}
