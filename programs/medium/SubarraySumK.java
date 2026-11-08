import java.util.HashMap;

public class SubarraySumK {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, -2, 2};
        int k = 3;
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);
        int sum = 0;
        int count = 0;

        for (int n : nums) {
            sum += n;
            count += map.getOrDefault(sum - k, 0);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        System.out.println("Subarrays with sum " + k + " = " + count);
    }
}
