public class IllustrationSortAlgorithm {
    public void insertionSort(int[] array) {
        int valueToInsert;
        int holePosition;
        int i;

        for (i = 1; i < array.length; i++) {
            valueToInsert = array[i];
            holePosition = i;
            while (holePosition > 0 && array[holePosition - 1] > valueToInsert) {
                array[holePosition] = array[holePosition - 1];
                holePosition--;
                System.out.println("Di chuyển phần tử: " + array[holePosition]);
            }
            if (holePosition != i) {
                System.out.println(" Chèn phần tử: " + valueToInsert + ", tại vị trí: " + holePosition);
                array[holePosition] = valueToInsert;
            }
            System.out.println("Vòng lặp thứ: " + i);
            display(array);
        }
    }

    public void display(int[] array) {
        int i;
        System.out.print("[");
        for (i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print("]\n");
    }

    public static void main(String[] args) {
        int[] array = { 6, 7, 0, 2, 8, 1, 3, 9, 4, 5 };
        IllustrationSortAlgorithm sortAlgorithm = new IllustrationSortAlgorithm();
        System.out.println("Nhập dữ liệu đầu vào: ");
        sortAlgorithm.display(array);
        System.out.println("----------------------");
        sortAlgorithm.insertionSort(array);
        System.out.println("----------------------");
        System.out.println("\n Mảng sau khi đã sắp xếp: ");
        sortAlgorithm.display(array);
    }
}
