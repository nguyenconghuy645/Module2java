import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PalinStringQueue {
    public static void main(String[] args) {
        System.out.println("Nhập chuỗi cần kiểm tra: ");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        Queue queue = new LinkedList();
        for (int i = string.length() - 1; i >= 0; i--) {
            queue.add(string.charAt(i));
        }
        String reverseString = "";
        while (!queue.isEmpty()) {
            reverseString = reverseString + queue.remove();
        }
        if (string.equals(reverseString)) {
            System.out.println("Đây là chuỗi đối xứng.");
        } else {
            System.out.println("Đây không phải là chuỗi đối xứng.");
        }
    }
}
