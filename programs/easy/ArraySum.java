public class ArraySum {
    static int sum(int[] a) {
        int total = 0;
        for (int num : a) total += num;
        return total;
    }

    public static void main(String[] args) {
        int[] a = {4, 2, 8, 1, 5};
        System.out.println("Sum = " + sum(a));
    }
}
