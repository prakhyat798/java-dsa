public class SortLinkedList {
    static class Node {
        int val;
        Node next;
        Node(int val) { this.val = val; }
    }

    static Node merge(Node a, Node b) {
        Node dummy = new Node(0), tail = dummy;
        while (a != null && b != null) {
            if (a.val <= b.val) {
                tail.next = a; a = a.next;
            } else {
                tail.next = b; b = b.next;
            }
            tail = tail.next;
        }
        tail.next = a == null ? b : a;
        return dummy.next;
    }

    static Node sort(Node head) {
        if (head == null || head.next == null) return head;
        Node slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node right = slow.next;
        slow.next = null;
        return merge(sort(head), sort(right));
    }

    public static void main(String[] args) {
        Node head = new Node(4);
        head.next = new Node(2);
        head.next.next = new Node(1);
        head.next.next.next = new Node(3);
        for (Node p = sort(head); p != null; p = p.next) System.out.print(p.val + " ");
    }
}
