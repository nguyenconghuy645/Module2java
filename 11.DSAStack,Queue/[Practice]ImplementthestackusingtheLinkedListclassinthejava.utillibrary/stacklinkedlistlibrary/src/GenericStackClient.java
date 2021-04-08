import java.util.Map;

public class GenericStackClient {
    public static void main(String[] args) {
        System.out.println("1. Stack of integers");
        stackOfIntegers();
        System.out.println("\n2. Stack of Strings");
        stackOfStrings();
    }

    private static void stackOfStrings() {
        MyGenericStack<String> myGenericStack = new MyGenericStack<>();
        myGenericStack.push("five");
        myGenericStack.push("four");
        myGenericStack.push("three");
        myGenericStack.push("two");
        myGenericStack.push("one");
        System.out.println("1.1. Size of stack after push operations: " + myGenericStack.size());
        System.out.println("1.2. Pop elements from stack: ");
        while (!myGenericStack.isEmpty()) {
            System.out.printf(" %s", myGenericStack.pop());
        }
        System.out.println("\n1.3. Size of stack after pop operations: " + myGenericStack.size());
    }

    private static void stackOfIntegers() {
        MyGenericStack<Integer> myGenericStack = new MyGenericStack<>();
        myGenericStack.push(5);
        myGenericStack.push(4);
        myGenericStack.push(3);
        myGenericStack.push(2);
        myGenericStack.push(1);
        System.out.println("2.1. Size of stack after push operations: " + myGenericStack.size());
        System.out.println("2.2. Pop elements from stack: ");
        while (!myGenericStack.isEmpty()) {
            System.out.printf(" %d", myGenericStack.pop());
        }
        System.out.println("\n3.3. Size of stack after pop operations: " + myGenericStack.size());
    }
}
