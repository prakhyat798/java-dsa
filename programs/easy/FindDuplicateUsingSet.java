import java.util.HashSet;

public class FindDuplicateUsingSet {
    static int firstDuplicate(int[] a) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : a) {
            if (!seen.add(num)) return num;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {7, 2, 9, 4, 2, 7};
        System.out.println(firstDuplicate(a));
    }
}
