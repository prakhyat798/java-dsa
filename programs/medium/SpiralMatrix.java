import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    static List<Integer> spiral(int[][] a) {
        List<Integer> result = new ArrayList<>();
        if (a.length == 0 || a[0].length == 0) return result;
        int top = 0, bottom = a.length - 1;
        int left = 0, right = a[0].length - 1;

        while (top <= bottom && left <= right) {
            for (int j = left; j <= right; j++) result.add(a[top][j]);
            top++;
            for (int i = top; i <= bottom; i++) result.add(a[i][right]);
            right--;
            if (top <= bottom) {
                for (int j = right; j >= left; j--) result.add(a[bottom][j]);
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) result.add(a[i][left]);
                left++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(spiral(a));
    }
}
