

public class OperaBinarySearchTree {
    public class Node {
        public String name;
        int data;
        Node left, right;
    }

    public void postOrder(Node root) {
        if (root.left != null) {
            postOrder(root.left);
        }
        if (root.right != null) {
            postOrder(root.right);
        }
        System.out.println(root.name);
    }
}
