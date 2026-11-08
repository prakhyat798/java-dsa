public class FindPeakElement {
    static int peakIndex(int[] a) {
        if (a.length == 0) return -1;
        int l = 0, r = a.length - 1;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (a[mid] < a[mid + 1]) l = mid + 1;
            else r = mid;
        }
        return l;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 1, 3, 5, 6, 4};
        int index = peakIndex(a);
        System.out.println(index + " -> " + a[index]);
    }
}
