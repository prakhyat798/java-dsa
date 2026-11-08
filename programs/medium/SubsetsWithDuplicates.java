import java.util.*;

public class SubsetsWithDuplicates {
    static void find(int[] a, int start, List<Integer> path, List<List<Integer>> ans) {
        ans.add(new ArrayList<>(path));
        for (int i = start; i < a.length; i++) {
            if (i > start && a[i] == a[i - 1]) continue;
            path.add(a[i]);
            find(a, i + 1, path, ans);
            path.remove(path.size() - 1);
        }
    }

    static List<List<Integer>> subsets(int[] nums) {
        int[] a = Arrays.copyOf(nums, nums.length);
        Arrays.sort(a);
        List<List<Integer>> ans = new ArrayList<>();
        find(a, 0, new ArrayList<>(), ans);
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(subsets(new int[]{1, 2, 2}));
    }
}
