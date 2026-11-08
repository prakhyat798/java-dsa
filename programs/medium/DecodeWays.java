public class DecodeWays {
    // '1' to '26' map to letters A to Z.
    static int ways(String digits) {
        if (digits.isEmpty()) return 0;
        int beforePrevious = 1;
        int previous = digits.charAt(0) == '0' ? 0 : 1;
        for (int i = 1; i < digits.length(); i++) {
            int current = 0;
            if (digits.charAt(i) != '0') current += previous;
            int pair = (digits.charAt(i - 1) - '0') * 10 + digits.charAt(i) - '0';
            if (pair >= 10 && pair <= 26) current += beforePrevious;
            beforePrevious = previous;
            previous = current;
        }
        return previous;
    }

    public static void main(String[] args) {
        System.out.println(ways("226"));
    }
}
