import java.util.*;

public class AsteroidCollision {
    static int[] collide(int[] asteroids) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (int a : asteroids) {
            boolean alive = true;
            while (alive && a < 0 && !stack.isEmpty() && stack.peekLast() > 0) {
                int last = stack.peekLast();
                if (last < -a) stack.removeLast();
                else {
                    if (last == -a) stack.removeLast();
                    alive = false;
                }
            }
            if (alive) stack.addLast(a);
        }
        int[] result = new int[stack.size()];
        int i = 0;
        for (int value : stack) result[i++] = value;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(collide(new int[]{5, 10, -5})));
    }
}
