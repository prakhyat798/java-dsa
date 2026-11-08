public class CountEvenOdd {
    public static void main(String[] args) {
        int[] a = {3, 6, 0, 9, 12, 7};
        int even = 0, odd = 0;
        for (int num : a) {
            if (num % 2 == 0) even++;
            else odd++;
        }
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
