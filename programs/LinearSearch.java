public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {10, 25, 7, 40, 18};
        int key = 40;
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Found at index " + index);
        }
    }
}
