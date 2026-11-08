public class KokoEatingBananas {
    static int minSpeed(int[] piles, int hours) {
        int high = 0;
        for (int pile : piles) high = Math.max(high, pile);
        if (high == 0) return 0;
        int low = 1;
        while (low < high) {
            int speed = low + (high - low) / 2;
            long time = 0;
            for (int pile : piles) time += ((long) pile + speed - 1) / speed;
            if (time <= hours) high = speed;
            else low = speed + 1;
        }
        return low;
    }

    public static void main(String[] args) {
        System.out.println(minSpeed(new int[]{3, 6, 7, 11}, 8));
    }
}
