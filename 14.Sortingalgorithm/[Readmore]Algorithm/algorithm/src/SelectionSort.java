public class SelectionSort {
    public void selectionSort(int[] array) {
        int arrayLength = array.length;

        for (int i = 0; i < arrayLength - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < arrayLength; j++) {
                if (array[j] < array[min_idx]) {
                    min_idx = j;
                }
            }
            int temp = array[min_idx];
            array[min_idx] = array[i];
            array[i] = temp;
        }
    }

    public void printArray(int[] array) {
        int arrayLength = array.length;
        for (int i = 0; i < arrayLength; ++i) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SelectionSort selectSort = new SelectionSort();
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = (int) Math.floor(Math.random()*1000);
        }
        System.out.println("Not sort array: ");
        selectSort.printArray(array);
        selectSort.selectionSort(array);
        System.out.println("Sorted array: ");
        selectSort.printArray(array);
    }
}
