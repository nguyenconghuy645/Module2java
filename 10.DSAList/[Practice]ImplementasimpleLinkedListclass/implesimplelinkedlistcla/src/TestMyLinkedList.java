public class TestMyLinkedList {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList myLinkedList = new MyLinkedList(10);
        myLinkedList.addFirst(11);
        myLinkedList.addFirst(12);
        myLinkedList.addFirst(13);

        myLinkedList.add(4, 9);
        myLinkedList.add(4, 9);
        myLinkedList.printList();
        System.out.println("Giá trị: " + myLinkedList.get(4));
        myLinkedList.add(10, 100);
        myLinkedList.addFirst(455);
        myLinkedList.printList();
    }
}
