public class DiameterBinaryTree {
    static class Node {
        int val;
        Node left, right;
        Node(int val) { this.val = val; }
    }

    static int height(Node root, int[] best) {
        if (root == null) return 0;
        int left = height(root.left, best);
        int right = height(root.right, best);
        best[0] = Math.max(best[0], left + right);
        return 1 + Math.max(left, right);
    }

    static int diameter(Node root) {
        int[] best = {0};
        height(root, best);
        return best[0]; // Number of edges on the longest path.
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        System.out.println(diameter(root));
    }
}
