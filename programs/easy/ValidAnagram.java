import java.util.Arrays;

public class ValidAnagram {
    static boolean check(String first, String second) {
        if (first.length() != second.length()) return false;
        char[] a = first.toCharArray();
        char[] b = second.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a, b);
    }

    public static void main(String[] args) {
        System.out.println(check("listen", "silent"));
    }
}
