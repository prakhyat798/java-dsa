public class LinkedListCycleStart {
    static class Node {
        int data;
        Node next;

        Node(int n) {
            data = n;
        }
    }

    static Node findCycle(Node head) {
        Node slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                Node start = head;
                while (start != slow) {
                    start = start.next;
                    slow = slow.next;
                }
                return start;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = b;

        Node answer = findCycle(a);
        System.out.println(answer == null ? "No cycle" : "Cycle starts at " + answer.data);
    }
}
