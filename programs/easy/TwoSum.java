import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    static int[] findPair(int[] a, int target) {
        HashMap<Integer, Integer> positions = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            int need = target - a[i];
            if (positions.containsKey(need))
                return new int[]{positions.get(need), i};
            positions.put(a[i], i);
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] a = {5, 9, 2, 8};
        System.out.println(Arrays.toString(findPair(a, 11)));
    }
}
