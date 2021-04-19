import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public Integer[] createRandom() {
        Random random = new Random();
        Integer[] array = new Integer[100];
        System.out.println("Danh sách phần tử của mảng: ");
        for (int i = 0; i < 100; i++) {
            array[i] = random.nextInt();
            System.out.print(array[i] + " ");
        }
        return array;
    }

    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] array = arrayExample.createRandom();

        Scanner scanner = new Scanner(System.in);
        System.out.println("\n Vui lòng nhập chỉ số của một phần tử bất kỳ: ");
        int index = scanner.nextInt();
        try {
            System.out.println("Giá trj của phần tử có chỉ số " + index + " là " + array[index]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Chỉ số vượt quá giới hạn của mảng.");
        }
    }
}
