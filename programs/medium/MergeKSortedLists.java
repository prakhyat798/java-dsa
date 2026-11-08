import java.util.*;

public class MergeKSortedLists {
    static class Node {
        int val;
        Node next;
        Node(int val) { this.val = val; }
    }

    static Node merge(Node[] lists) {
        PriorityQueue<Node> pq = new PriorityQueue<>((a, b) -> Integer.compare(a.val, b.val));
        for (Node head : lists) if (head != null) pq.add(head);
        Node dummy = new Node(0), tail = dummy;
        while (!pq.isEmpty()) {
            Node node = pq.poll();
            if (node.next != null) pq.add(node.next);
            tail.next = node;
            tail = node;
        }
        tail.next = null;
        return dummy.next;
    }

    public static void main(String[] args) {
        Node a = new Node(1); a.next = new Node(4);
        Node b = new Node(2); b.next = new Node(3);
        Node head = merge(new Node[]{a, b});
        for (Node p = head; p != null; p = p.next) System.out.print(p.val + " ");
    }
}
