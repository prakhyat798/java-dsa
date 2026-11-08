public class CountOccurrences {
    static int count(int[] a, int key) {
        int ans = 0;
        for (int value : a) {
            if (value == key) ans++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] a = {4, 1, 4, 2, 4, 9};
        System.out.println(count(a, 4));
    }
}
