public class MinimumWindowSubstring {
    static String window(String s, String t) {
        if (t.isEmpty()) return "";
        int[] need = new int[65536];
        for (char c : t.toCharArray()) need[c]++;
        int missing = t.length(), left = 0, start = 0, best = Integer.MAX_VALUE;
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            if (need[c] > 0) missing--;
            need[c]--;
            while (missing == 0) {
                if (right - left + 1 < best) {
                    best = right - left + 1;
                    start = left;
                }
                char old = s.charAt(left++);
                need[old]++;
                if (need[old] > 0) missing++;
            }
        }
        return best == Integer.MAX_VALUE ? "" : s.substring(start, start + best);
    }

    public static void main(String[] args) {
        System.out.println(window("ADOBECODEBANC", "ABC"));
    }
}
