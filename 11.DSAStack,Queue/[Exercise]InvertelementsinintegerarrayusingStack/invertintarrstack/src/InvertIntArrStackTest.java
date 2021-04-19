import java.util.Stack;

public class InvertIntArrStackTest {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(31);
        stack.push(54353);
        stack.push(423);
        stack.push(43);
        stack.push(69);
        stack.push(72);
        stack.push(96);
        stack.push(2);
        stack.push(454);

        int[] array = new int[10];

        for (int i = 0; i < 10; i++) {
            array[i] = stack.pop();
        }
        for (int i = 0; i < 10; i++) {
            stack.push(array[i]);
        }

        System.out.println("Mảng số nguyên: " + stack);

        boolean result = !stack.isEmpty();
        System.out.println(result);
        boolean re = !stack.empty();
        System.out.println(re);
    }
}
