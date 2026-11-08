public class CharacterReplacement {
    // Uppercase English letters only.
    static int longest(String s, int k) {
        int[] count = new int[26];
        int left = 0, biggest = 0, best = 0;
        for (int right = 0; right < s.length(); right++) {
            int index = s.charAt(right) - 'A';
            biggest = Math.max(biggest, ++count[index]);
            while (right - left + 1 - biggest > k) {
                count[s.charAt(left) - 'A']--;
                left++;
            }
            best = Math.max(best, right - left + 1);
        }
        return best;
    }

    public static void main(String[] args) {
        System.out.println(longest("AABABBA", 1));
    }
}
