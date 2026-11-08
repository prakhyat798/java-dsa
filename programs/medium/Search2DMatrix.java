public class Search2DMatrix {
    // Rows are sorted and each row starts after the previous row ends.
    static boolean search(int[][] a, int target) {
        if (a.length == 0 || a[0].length == 0) return false;
        int cols = a[0].length;
        int left = 0, right = a.length * cols - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int value = a[mid / cols][mid % cols];
            if (value == target) return true;
            if (value < target) left = mid + 1;
            else right = mid - 1;
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] a = {{1, 3, 5}, {7, 9, 11}, {13, 15, 17}};
        System.out.println(search(a, 9));
    }
}
