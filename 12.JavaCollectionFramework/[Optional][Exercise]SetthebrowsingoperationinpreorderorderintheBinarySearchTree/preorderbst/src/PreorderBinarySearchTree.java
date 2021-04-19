public class PreorderBinarySearchTree {
    public class Node{
        public boolean name;
        int data;
        Node left, right;
    };
    void preOrderPrint(Node root)
    {
        System.out.println(root.name);
        if (root.left != null) preOrderPrint(root.left);
        if (root.right != null) preOrderPrint(root.right);
    }
}
