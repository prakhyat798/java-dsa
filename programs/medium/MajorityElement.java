public class MajorityElement {
    static int majority(int[] a) {
        if (a.length == 0) throw new IllegalArgumentException("Empty array");
        int candidate = 0, count = 0;
        for (int value : a) {
            if (count == 0) candidate = value;
            count += value == candidate ? 1 : -1;
        }
        int frequency = 0;
        for (int value : a) {
            if (value == candidate) frequency++;
        }
        if (frequency <= a.length / 2)
            throw new IllegalArgumentException("No majority element");
        return candidate;
    }

    public static void main(String[] args) {
        int[] a = {2, 2, 1, 3, 2, 2, 4};
        System.out.println(majority(a));
    }
}
