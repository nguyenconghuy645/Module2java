public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList(1);
        myLinkedList.add(1, 2);
        myLinkedList.add(2, "Hyun");
        myLinkedList.add(3, 4);
        myLinkedList.add(4, 5);
        myLinkedList.addFirst(0);
        System.out.println(myLinkedList.indexOf("Hyun"));
    }
}
