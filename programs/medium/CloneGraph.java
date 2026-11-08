import java.util.*;

public class CloneGraph {
    static class Node {
        int val;
        List<Node> neighbors = new ArrayList<>();
        Node(int val) { this.val = val; }
    }

    static Node copy(Node start) {
        if (start == null) return null;
        Map<Node, Node> clones = new HashMap<>();
        Queue<Node> q = new ArrayDeque<>();
        clones.put(start, new Node(start.val));
        q.add(start);
        while (!q.isEmpty()) {
            Node current = q.remove();
            for (Node next : current.neighbors) {
                if (!clones.containsKey(next)) {
                    clones.put(next, new Node(next.val));
                    q.add(next);
                }
                clones.get(current).neighbors.add(clones.get(next));
            }
        }
        return clones.get(start);
    }

    public static void main(String[] args) {
        Node a = new Node(1), b = new Node(2);
        a.neighbors.add(b); b.neighbors.add(a);
        Node clone = copy(a);
        System.out.println(clone.val + " -> " + clone.neighbors.get(0).val);
        System.out.println(clone != a);
    }
}
