import java.util.*;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] arr = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

        ArrayList<int[]> result = new ArrayList<>();

        for (int[] pair : arr) {
            if (result.isEmpty() || result.get(result.size() - 1)[1] < pair[0]) {
                result.add(new int[]{pair[0], pair[1]});
            } else {
                int[] last = result.get(result.size() - 1);
                last[1] = Math.max(last[1], pair[1]);
            }
        }

        for (int[] pair : result) {
            System.out.println(pair[0] + " " + pair[1]);
        }
    }
}
