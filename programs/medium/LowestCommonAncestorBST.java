public class LowestCommonAncestorBST {
    static class Node {
        int val;
        Node left, right;
        Node(int val) { this.val = val; }
    }

    static Node lca(Node root, int a, int b) {
        while (root != null) {
            if (a < root.val && b < root.val) root = root.left;
            else if (a > root.val && b > root.val) root = root.right;
            else return root;
        }
        return null;
    }

    public static void main(String[] args) {
        Node root = new Node(6);
        root.left = new Node(2);
        root.right = new Node(8);
        root.left.left = new Node(0);
        root.left.right = new Node(4);
        Node answer = lca(root, 0, 4);
        System.out.println(answer == null ? "Not found" : answer.val);
    }
}
