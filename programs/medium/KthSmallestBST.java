import java.util.*;

public class KthSmallestBST {
    static class Node {
        int val;
        Node left, right;
        Node(int val) { this.val = val; }
    }

    static int kthSmallest(Node root, int k) {
        if (k < 1) throw new IllegalArgumentException("Invalid k");
        Deque<Node> stack = new ArrayDeque<>();
        Node curr = root;
        while (curr != null || !stack.isEmpty()) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            if (--k == 0) return curr.val;
            curr = curr.right;
        }
        throw new IllegalArgumentException("k is too large");
    }

    public static void main(String[] args) {
        Node root = new Node(3);
        root.left = new Node(1);
        root.right = new Node(4);
        root.left.right = new Node(2);
        System.out.println(kthSmallest(root, 2));
    }
}
