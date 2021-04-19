public class BubbleSort {
    public static void bubbleSort(int[] array, int n) {
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (swapped == false) {
                break;
            }
        }
    }

    public static void printArray(int[] array, int size) {
        int i;
        for (i = 0; i < size; i++) {
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
        printArray(array, array.length);
        int arrayLength = array.length;
        bubbleSort(array, arrayLength);
        System.out.println("Sorted array: ");
        printArray(array, arrayLength);
    }
}
