public class ValidParenthesisString {
    // * can be '(' or ')' or an empty character.
    static boolean valid(String s) {
        int minOpen = 0, maxOpen = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                minOpen++;
                maxOpen++;
            } else if (c == ')') {
                minOpen--;
                maxOpen--;
            } else if (c == '*') {
                minOpen--;
                maxOpen++;
            } else {
                return false;
            }
            if (maxOpen < 0) return false;
            if (minOpen < 0) minOpen = 0;
        }
        return minOpen == 0;
    }

    public static void main(String[] args) {
        System.out.println(valid("(*))"));
    }
}
