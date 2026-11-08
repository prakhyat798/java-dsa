public class HouseRobber {
    static int maxMoney(int[] a) {
        int takeOrSkip = 0, previous = 0;
        for (int amount : a) {
            int current = Math.max(takeOrSkip, previous + amount);
            previous = takeOrSkip;
            takeOrSkip = current;
        }
        return takeOrSkip;
    }

    public static void main(String[] args) {
        System.out.println(maxMoney(new int[]{2, 7, 9, 3, 1}));
    }
}
