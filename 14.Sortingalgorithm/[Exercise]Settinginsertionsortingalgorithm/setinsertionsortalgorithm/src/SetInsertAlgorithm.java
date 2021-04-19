public class SetInsertAlgorithm {
    public void insertionSort(int[] list) {
        int listLength = list.length;
        for (int i = 0; i < listLength; ++i) {
            int key = list[i];
            int j = i - 1;

            while (j >= 0 && list[j] > key) {
                list[j + 1] = list[j];
                j = j - 1;
            }
            list[j + 1] = key;
        }
    }

    public static void printList(int[] list) {
        int listLength = list.length;
        for (int i = 0; i < listLength; ++i) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] list = new int[20];
        for (int i = 0; i < 20; i++) {
            list[i] = (int) Math.floor(Math.random()*1000);
        }
        System.out.println("Mảng ban đầu: ");
        printList(list);
        SetInsertAlgorithm insertAlgorithm = new SetInsertAlgorithm();
        insertAlgorithm.insertionSort(list);
        System.out.println("Mảng sau khi sắp xếp: ");
        printList(list);
    }
}
