public class ReorderLinkedList {
    static class Node {
        int val;
        Node next;
        Node(int val) { this.val = val; }
    }

    static void reorder(Node head) {
        if (head == null || head.next == null) return;
        Node slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node second = slow.next;
        slow.next = null;
        Node prev = null;
        while (second != null) {
            Node next = second.next;
            second.next = prev;
            prev = second;
            second = next;
        }
        Node first = head;
        while (prev != null) {
            Node a = first.next, b = prev.next;
            first.next = prev;
            prev.next = a;
            first = a;
            prev = b;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        reorder(head);
        for (Node p = head; p != null; p = p.next) System.out.print(p.val + " ");
    }
}
