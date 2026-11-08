import java.util.*;

public class ConstructTreePreorderInorder {
    static class Node {
        int val;
        Node left, right;
        Node(int val) { this.val = val; }
    }

    static Node build(int[] preorder, int[] next, int l, int r, Map<Integer, Integer> positions) {
        if (l > r) return null;
        int value = preorder[next[0]++];
        Integer mid = positions.get(value);
        if (mid == null || mid < l || mid > r) throw new IllegalArgumentException("Invalid traversals");
        Node root = new Node(value);
        root.left = build(preorder, next, l, mid - 1, positions);
        root.right = build(preorder, next, mid + 1, r, positions);
        return root;
    }

    // Assumes unique values and matching traversals.
    static Node construct(int[] preorder, int[] inorder) {
        if (preorder.length != inorder.length) throw new IllegalArgumentException();
        Map<Integer, Integer> positions = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) positions.put(inorder[i], i);
        return build(preorder, new int[]{0}, 0, inorder.length - 1, positions);
    }

    static void printInorder(Node root) {
        if (root == null) return;
        printInorder(root.left);
        System.out.print(root.val + " ");
        printInorder(root.right);
    }

    public static void main(String[] args) {
        Node root = construct(new int[]{3, 9, 20, 15, 7}, new int[]{9, 3, 15, 20, 7});
        printInorder(root);
    }
}
