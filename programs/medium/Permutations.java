import java.util.*;

public class Permutations {
    static void backtrack(int[] a, boolean[] used, List<Integer> path, List<List<Integer>> ans) {
        if (path.size() == a.length) {
            ans.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < a.length; i++) {
            if (used[i]) continue;
            used[i] = true;
            path.add(a[i]);
            backtrack(a, used, path, ans);
            path.remove(path.size() - 1);
            used[i] = false;
        }
    }

    static List<List<Integer>> all(int[] a) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(a, new boolean[a.length], new ArrayList<>(), ans);
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(all(new int[]{1, 2, 3}));
    }
}
