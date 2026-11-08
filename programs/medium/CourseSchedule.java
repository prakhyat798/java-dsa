import java.util.*;

public class CourseSchedule {
    static boolean canFinish(int n, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) graph.add(new ArrayList<>());
        int[] inDegree = new int[n];
        for (int[] pair : prerequisites) {
            graph.get(pair[1]).add(pair[0]);
            inDegree[pair[0]]++;
        }
        Queue<Integer> q = new ArrayDeque<>();
        for (int i = 0; i < n; i++) if (inDegree[i] == 0) q.add(i);
        int finished = 0;
        while (!q.isEmpty()) {
            int course = q.remove();
            finished++;
            for (int next : graph.get(course)) {
                if (--inDegree[next] == 0) q.add(next);
            }
        }
        return finished == n;
    }

    public static void main(String[] args) {
        System.out.println(canFinish(2, new int[][]{{1, 0}, {0, 1}}));
    }
}
