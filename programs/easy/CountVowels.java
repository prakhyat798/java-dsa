public class CountVowels {
    static int count(String s) {
        int total = 0;
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            if ("aeiou".indexOf(s.charAt(i)) != -1) total++;
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println(count("Data Structures"));
    }
}
