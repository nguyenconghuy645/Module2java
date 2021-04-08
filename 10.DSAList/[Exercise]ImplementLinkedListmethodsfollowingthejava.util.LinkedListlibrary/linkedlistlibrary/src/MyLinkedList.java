public class MyLinkedList<Elements> {
    private Node head;
    private int numNodes;
    private boolean flag;

    public class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    public MyLinkedList(Object data) {
        head = new Node(data);
    }

    public void add(int index, Object data) {
        Node temp = head;
        Node holder;

        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }

        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNodes++;
    }

    public void addFirst(Object data) {
        if (head == null) {
            addFirst(data);
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node(data);
        }
    }

//    public void addLast(Elements elements) {
//
//    }

    public void remove(int index) {
        Node temp = head;

        for (int i = 0; i < index -1 && temp.next != null; i++) {
            temp.next = temp.next.next;
        }
        numNodes--;
    }

//    public boolean remove(Object elements) {
//
//    }

    public void size() {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            temp = temp.next;
            i++;
        }
        System.out.println(i);
    }

//    public Elements clone() {
//
//    }

    public boolean contains(Object data) {
        Node temp = head;
        for (int i = 0; i <= numNodes; i++) {
            if ((temp.data).equals(data)) {
                flag = true;
                break;
            } else {
                flag = false;
                temp = temp.next;
            }
        }
        return flag;
    }

    public int indexOf(Object data) {
        Node temp = head;
        int q = 0;
        for (int i = 0; i <= numNodes; i++) {
            if ((temp.data).equals(data)) {
                q = i;
                break;
            } else {
                temp = temp.next;
            }
        }
        return q;
    }

//    public boolean add(Elements elements) {
//
//    }

//    public void ensureCapacity(int minCapacity) {
//
//    }

    public void get(int index) {
        Node temp = head;
        for (int i = 0; i < index -1; i++) {
            temp = temp.next;
        }
        System.out.println(temp.data);
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

//    public Elements getFirst() {
//
//    }

//    public Elements getLast() {
//
//    }

//    public void clear() {
//
//    }
}
