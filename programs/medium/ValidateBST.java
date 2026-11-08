public class ValidateBST {
    static class Node {
        int val;
        Node left, right;
        Node(int val) { this.val = val; }
    }

    static boolean check(Node root, long low, long high) {
        if (root == null) return true;
        if (root.val <= low || root.val >= high) return false;
        return check(root.left, low, root.val)
                && check(root.right, root.val, high);
    }

    static boolean isValid(Node root) {
        return check(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(3);
        root.right = new Node(8);
        root.right.left = new Node(6);
        System.out.println(isValid(root));
    }
}
