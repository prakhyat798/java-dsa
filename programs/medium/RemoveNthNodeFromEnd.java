public class RemoveNthNodeFromEnd {
    static class Node {
        int val;
        Node next;
        Node(int val) { this.val = val; }
    }

    static Node remove(Node head, int n) {
        if (n < 1) throw new IllegalArgumentException("n must be positive");
        Node dummy = new Node(0);
        dummy.next = head;
        Node fast = dummy, slow = dummy;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
            if (fast == null) throw new IllegalArgumentException("n is too large");
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head = remove(head, 2);
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
}
