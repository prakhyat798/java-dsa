import java.util.HashMap;

public class LongestSubstring {
    public static void main(String[] args) {
        String s = "abcabcbb";
        HashMap<Character, Integer> last = new HashMap<>();

        int left = 0;
        int max = 0;

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);

            if (last.containsKey(ch) && last.get(ch) >= left) {
                left = last.get(ch) + 1;
            }

            last.put(ch, right);
            max = Math.max(max, right - left + 1);
        }

        System.out.println("Longest length = " + max);
    }
}
