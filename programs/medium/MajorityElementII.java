import java.util.*;

public class MajorityElementII {
    static List<Integer> majority(int[] a) {
        int x = 0, y = 1, cx = 0, cy = 0;
        for (int v : a) {
            if (cx > 0 && v == x) cx++;
            else if (cy > 0 && v == y) cy++;
            else if (cx == 0) { x = v; cx = 1; }
            else if (cy == 0) { y = v; cy = 1; }
            else { cx--; cy--; }
        }
        cx = 0; cy = 0;
        for (int v : a) {
            if (v == x) cx++;
            else if (v == y) cy++;
        }
        List<Integer> ans = new ArrayList<>();
        if (cx > a.length / 3) ans.add(x);
        if (cy > a.length / 3) ans.add(y);
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(majority(new int[]{3, 2, 3}));
    }
}
