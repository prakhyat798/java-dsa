import java.util.*;

public class GenerateParentheses {
    static void make(String s, int open, int close, int n, ArrayList<String> ans) {
        if (s.length() == 2 * n) {
            ans.add(s);
            return;
        }

        if (open < n) {
            make(s + "(", open + 1, close, n, ans);
        }

        if (close < open) {
            make(s + ")", open, close + 1, n, ans);
        }
    }

    public static void main(String[] args) {
        int n = 3;
        ArrayList<String> ans = new ArrayList<>();
        make("", 0, 0, n, ans);

        for (String s : ans) {
            System.out.println(s);
        }
    }
}
