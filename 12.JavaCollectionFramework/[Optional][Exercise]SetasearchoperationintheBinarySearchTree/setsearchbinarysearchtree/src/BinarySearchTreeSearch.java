public class BinarySearchTreeSearch {
    public class Node {
        int key;
        Node left, right;
    }
    public Node search(Node root, int key) {
        if (root == null || root.key == key) {
            return root;
        }
        if (root.key > key) {
            return search(root.left, key);
        }
        return search(root.right, key);
    }
}
