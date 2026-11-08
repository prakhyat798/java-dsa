public class GcdLcm {
    static int gcd(int a, int b) {
        while (b != 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }
        return Math.abs(a);
    }

    static long lcm(int a, int b) {
        if (a == 0 || b == 0) return 0;
        return Math.abs(((long) a / gcd(a, b)) * b);
    }

    public static void main(String[] args) {
        int a = 12, b = 18;
        System.out.println("GCD: " + gcd(a, b));
        System.out.println("LCM: " + lcm(a, b));
    }
}
