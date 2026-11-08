public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {12, 5, 20, 8, 20, 15};
        int largest = arr[0];

        for (int n : arr) {
            if (n > largest) {
                largest = n;
            }
        }

        int second = 0;
        boolean found = false;

        for (int n : arr) {
            if (n != largest && (!found || n > second)) {
                second = n;
                found = true;
            }
        }

        if (found) {
            System.out.println("Second largest: " + second);
        } else {
            System.out.println("No second largest element");
        }
    }
}
