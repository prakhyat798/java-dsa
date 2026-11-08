public class LowestCommonAncestor {
    static class Node {
        int val;
        Node left, right;
        Node(int val) { this.val = val; }
    }

    // Both nodes should belong to the tree.
    static Node ancestor(Node root, Node a, Node b) {
        if (root == null || root == a || root == b) return root;
        Node left = ancestor(root.left, a, b);
        Node right = ancestor(root.right, a, b);
        if (left != null && right != null) return root;
        return left != null ? left : right;
    }

    public static void main(String[] args) {
        Node root = new Node(3);
        root.left = new Node(5);
        root.right = new Node(1);
        root.left.left = new Node(6);
        root.left.right = new Node(2);
        System.out.println(ancestor(root, root.left.left, root.left.right).val);
    }
}
