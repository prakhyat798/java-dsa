public class MissingNumber {
    // Numbers are from 0 to n, with exactly one missing.
    static int findMissing(int[] a) {
        int n = a.length;
        long expected = (long) n * (n + 1) / 2;
        long actual = 0;
        for (int num : a) actual += num;
        return (int) (expected - actual);
    }

    public static void main(String[] args) {
        int[] a = {0, 1, 3, 4, 5};
        System.out.println("Missing number: " + findMissing(a));
    }
}
