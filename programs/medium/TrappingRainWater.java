public class TrappingRainWater {
    static int trapped(int[] a) {
        int left = 0, right = a.length - 1;
        int leftMax = 0, rightMax = 0, water = 0;
        while (left < right) {
            if (a[left] <= a[right]) {
                leftMax = Math.max(leftMax, a[left]);
                water += leftMax - a[left];
                left++;
            } else {
                rightMax = Math.max(rightMax, a[right]);
                water += rightMax - a[right];
                right--;
            }
        }
        return water;
    }

    public static void main(String[] args) {
        int[] a = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(trapped(a));
    }
}
