import java.util.*;

public class CombinationSum {
    static void search(int[] a, int start, int left, List<Integer> path, List<List<Integer>> ans) {
        if (left == 0) {
            ans.add(new ArrayList<>(path));
            return;
        }
        for (int i = start; i < a.length; i++) {
            if (a[i] > left) break;
            if (i > start && a[i] == a[i - 1]) continue;
            path.add(a[i]);
            search(a, i, left - a[i], path, ans);
            path.remove(path.size() - 1);
        }
    }

    // Candidates must be positive.
    static List<List<Integer>> sums(int[] candidates, int target) {
        int[] a = Arrays.copyOf(candidates, candidates.length);
        Arrays.sort(a);
        List<List<Integer>> ans = new ArrayList<>();
        search(a, 0, target, new ArrayList<>(), ans);
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(sums(new int[]{2, 3, 6, 7}, 7));
    }
}
