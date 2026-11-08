public class JumpGameII {
    static int minJumps(int[] nums) {
        int steps = 0, currentEnd = 0, furthest = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (i > furthest) return -1;
            furthest = Math.max(furthest, i + nums[i]);
            if (i == currentEnd) {
                if (furthest == currentEnd) return -1;
                steps++;
                currentEnd = furthest;
                if (currentEnd >= nums.length - 1) return steps;
            }
        }
        return steps;
    }

    public static void main(String[] args) {
        System.out.println(minJumps(new int[]{2, 3, 1, 1, 4}));
    }
}
