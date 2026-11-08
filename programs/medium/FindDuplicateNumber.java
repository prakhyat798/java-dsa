public class FindDuplicateNumber {
    // Values must be in 1..n, with n+1 array entries.
    static int duplicate(int[] a) {
        int slow = a[0], fast = a[0];
        do {
            slow = a[slow];
            fast = a[a[fast]];
        } while (slow != fast);

        slow = a[0];
        while (slow != fast) {
            slow = a[slow];
            fast = a[fast];
        }
        return slow;
    }

    public static void main(String[] args) {
        int[] a = {1, 3, 4, 2, 2};
        System.out.println(duplicate(a));
    }
}
