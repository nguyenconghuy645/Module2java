import java.util.Scanner;

public class SmallValueArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập size cho mảng: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Nhập giá trị cho mảng: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("Giá trị nhỏ nhất trong mảng là: " + min);
    }
}
