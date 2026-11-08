public class ArmstrongNumber {
    static boolean isArmstrong(int n) {
        if (n < 0) return false;
        int digits = String.valueOf(n).length();
        int temp = n;
        long sum = 0;
        do {
            int digit = temp % 10;
            long power = 1;
            for (int i = 0; i < digits; i++) power *= digit;
            sum += power;
            temp /= 10;
        } while (temp > 0);
        return sum == n;
    }

    public static void main(String[] args) {
        System.out.println(isArmstrong(153));
        System.out.println(isArmstrong(123));
    }
}
