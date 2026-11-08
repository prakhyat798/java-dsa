import java.util.PriorityQueue;

public class KthLargestElement {
    static int find(int[] a, int k) {
        if (k < 1 || k > a.length) throw new IllegalArgumentException("Invalid k");
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : a) {
            minHeap.offer(num);
            if (minHeap.size() > k) minHeap.poll();
        }
        return minHeap.peek();
    }

    public static void main(String[] args) {
        int[] a = {3, 2, 1, 5, 6, 4};
        System.out.println(find(a, 2));
    }
}
