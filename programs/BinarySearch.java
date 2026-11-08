public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {3, 8, 12, 19, 26, 31, 45};
        int key = 26;
        int low = 0, high = arr.length - 1;
        int index = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == key) {
                index = mid;
                break;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println("Index: " + index);
    }
}
