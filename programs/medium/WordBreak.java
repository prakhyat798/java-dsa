import java.util.*;

public class WordBreak {
    static boolean canBreak(String s, List<String> words) {
        Set<String> dict = new HashSet<>(words);
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && dict.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }

    public static void main(String[] args) {
        System.out.println(canBreak("leetcode", Arrays.asList("leet", "code")));
    }
}
