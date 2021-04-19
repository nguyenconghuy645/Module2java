import java.util.Scanner;

public class BinarySerachRecursion {
    public int binarySerachRecursion(int[] array, int l, int r, int x) {
        if (r >= 1) {
            int mid = l + (r - l) / 2;
            if (array[mid] == x) {
                return mid;
            }
            if (array[mid] > x) {
                return binarySerachRecursion(array, l, mid - 1, x);
            }
            return binarySerachRecursion(array, mid + 1, r, x);
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySerachRecursion binary = new BinarySerachRecursion();
        int[] array = {2, 3, 4, 10, 40, 59};
        int n = array.length;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập giá trị cần tìm: ");
        int x = scanner.nextInt();
        int result = binary.binarySerachRecursion(array, 0, n - 1, x);
        if (result == -1) {
            System.out.println("Không tìm thấy phần tử " + x);
        } else {
            System.out.println("Phần tử " + x + " được tìm thấy tại chỉ số " + result);
        }
    }
}
