import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagrams {
    // Assumes lowercase English letters.
    static List<Integer> find(String text, String pattern) {
        List<Integer> result = new ArrayList<>();
        int k = pattern.length();
        if (k == 0 || k > text.length()) return result;

        int[] need = new int[26], window = new int[26];
        for (int i = 0; i < k; i++) need[pattern.charAt(i) - 'a']++;
        for (int i = 0; i < text.length(); i++) {
            window[text.charAt(i) - 'a']++;
            if (i >= k) window[text.charAt(i - k) - 'a']--;
            if (i >= k - 1 && Arrays.equals(need, window))
                result.add(i - k + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(find("cbaebabacd", "abc"));
    }
}
