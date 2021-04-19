public class InsertionSort {
    public void insertSort(int[] array) {
        int arrayLength = array.length;
        for (int i = 1; i < arrayLength; ++i) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }

    public static void printArray(int[] array) {
        int arrayLength = array.length;
        for (int i = 0; i < arrayLength; ++i) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = (int) Math.floor(Math.random()*1000);
        }
        System.out.println("Not sort array: ");
        printArray(array);
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.insertSort(array);
        System.out.println("Sorted array: ");
        printArray(array);
    }
}
