import java.util.*;

public class LetterCombinations {
    static final String[] KEYS = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    static void make(String digits, int pos, StringBuilder word, List<String> ans) {
        if (pos == digits.length()) {
            ans.add(word.toString());
            return;
        }
        String letters = KEYS[digits.charAt(pos) - '0'];
        for (int i = 0; i < letters.length(); i++) {
            word.append(letters.charAt(i));
            make(digits, pos + 1, word, ans);
            word.deleteCharAt(word.length() - 1);
        }
    }

    static List<String> combinations(String digits) {
        List<String> ans = new ArrayList<>();
        if (digits.isEmpty()) return ans;
        for (char d : digits.toCharArray())
            if (d < '2' || d > '9') throw new IllegalArgumentException("Use digits 2 to 9");
        make(digits, 0, new StringBuilder(), ans);
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(combinations("23"));
    }
}
