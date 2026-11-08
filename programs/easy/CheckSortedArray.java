public class CheckSortedArray {
    static boolean isSorted(int[] a) {
        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[i - 1]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] a = {1, 3, 3, 6, 9};
        System.out.println(isSorted(a));
    }
}
