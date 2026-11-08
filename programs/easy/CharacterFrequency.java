import java.util.LinkedHashMap;
import java.util.Map;

public class CharacterFrequency {
    public static void main(String[] args) {
        String s = "banana";
        Map<Character, Integer> freq = new LinkedHashMap<>();
        for (char ch : s.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }
        for (char ch : freq.keySet()) {
            System.out.println(ch + " = " + freq.get(ch));
        }
    }
}
