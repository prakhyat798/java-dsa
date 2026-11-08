import java.util.*;

public class CarFleet {
    static int countFleets(int target, int[] position, int[] speed) {
        int n = position.length;
        if (speed.length != n) throw new IllegalArgumentException();
        int[][] cars = new int[n][2];
        for (int i = 0; i < n; i++) {
            cars[i][0] = position[i];
            cars[i][1] = speed[i];
        }
        Arrays.sort(cars, (a, b) -> Integer.compare(b[0], a[0]));
        int fleets = 0;
        double lastArrival = -1;
        for (int[] car : cars) {
            double hours = (double) (target - car[0]) / car[1];
            if (hours > lastArrival) {
                fleets++;
                lastArrival = hours;
            }
        }
        return fleets;
    }

    public static void main(String[] args) {
        System.out.println(countFleets(12, new int[]{10, 8, 0, 5, 3}, new int[]{2, 4, 1, 1, 3}));
    }
}
