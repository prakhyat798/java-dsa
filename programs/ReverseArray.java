public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {4, 9, 2, 7, 1};
        int i = 0, j = arr.length - 1;

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
