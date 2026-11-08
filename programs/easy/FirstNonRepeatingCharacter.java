import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
    static char firstUnique(String s) {
        Map<Character, Integer> count = new LinkedHashMap<>();
        for (char c : s.toCharArray())
            count.put(c, count.getOrDefault(c, 0) + 1);
        for (char c : s.toCharArray()) {
            if (count.get(c) == 1) return c;
        }
        return '\0';
    }

    public static void main(String[] args) {
        char answer = firstUnique("aabbcde");
        System.out.println(answer == '\0' ? "Not found" : answer);
    }
}
