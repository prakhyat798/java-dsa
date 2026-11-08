public class CapacityToShipPackages {
    static long minCapacity(int[] weights, int days) {
        if (days < 1) throw new IllegalArgumentException("days must be positive");
        long low = 0, high = 0;
        for (int w : weights) {
            low = Math.max(low, w);
            high += w;
        }
        while (low < high) {
            long capacity = low + (high - low) / 2;
            int needed = 1;
            long load = 0;
            for (int w : weights) {
                if (load + w > capacity) {
                    needed++;
                    load = 0;
                }
                load += w;
            }
            if (needed <= days) high = capacity;
            else low = capacity + 1;
        }
        return low;
    }

    public static void main(String[] args) {
        System.out.println(minCapacity(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 5));
    }
}
