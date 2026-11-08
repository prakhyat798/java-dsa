public class DecimalToBinary {
    static String convert(int n) {
        if (n == 0) return "0";
        if (n < 0) return Integer.toBinaryString(n);
        StringBuilder ans = new StringBuilder();
        while (n > 0) {
            ans.append(n % 2);
            n /= 2;
        }
        return ans.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(convert(37));
    }
}
