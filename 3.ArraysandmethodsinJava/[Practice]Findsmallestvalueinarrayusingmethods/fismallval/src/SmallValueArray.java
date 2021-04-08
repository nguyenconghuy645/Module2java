public class SmallValueArray {
    public static void main(String[] args) {
        int[] arr = {4, 12, 7, 8, 1, 6, 9};
        int minval = minValue(arr);
        System.out.println("The smallest element in the array is: " + minval);
    }
    public static int minValue(int[] array) {
        int min = array[0];
        int i = 0;
        for ( ; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
}
