import java.util.*;

public class PalindromePartitioning {
    static boolean palindrome(String s, int l, int r) {
        while (l < r) if (s.charAt(l++) != s.charAt(r--)) return false;
        return true;
    }

    static void explore(String s, int start, List<String> part, List<List<String>> answer) {
        if (start == s.length()) {
            answer.add(new ArrayList<>(part));
            return;
        }
        for (int end = start; end < s.length(); end++) {
            if (!palindrome(s, start, end)) continue;
            part.add(s.substring(start, end + 1));
            explore(s, end + 1, part, answer);
            part.remove(part.size() - 1);
        }
    }

    static List<List<String>> partitions(String s) {
        List<List<String>> ans = new ArrayList<>();
        explore(s, 0, new ArrayList<>(), ans);
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(partitions("aab"));
    }
}
