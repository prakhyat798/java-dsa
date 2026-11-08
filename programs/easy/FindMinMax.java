public class FindMinMax {
    public static void main(String[] args) {
        int[] a = {12, 5, 27, -3, 18};
        int min = a[0], max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) min = a[i];
            if (a[i] > max) max = a[i];
        }
        System.out.println("Minimum = " + min);
        System.out.println("Maximum = " + max);
    }
}
