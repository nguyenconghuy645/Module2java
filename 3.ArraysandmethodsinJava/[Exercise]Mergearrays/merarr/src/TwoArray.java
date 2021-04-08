public class TwoArray {
    public static void main(String[] args) {
        int[] array = new int[10];
        int[] array2 = new int[15];
        for (int i = 0; i < 10; i++) {
            array[i] = (int) Math.round(Math.random()*100);
        }
        for (int i = 0; i < 15; i++) {
            array2[i] = (int) Math.round(Math.random()*100);
        }
        int[] array3 = new int[25];
        int pos = 0;
        for (int element:
             array) {
            array3[pos] = element;
            pos++;
        }
        for (int element: array2) {
            array3[pos] = element;
            pos++;
        }
        for (int i = 0; i < 25; i++) {
            System.out.println(array3[i]);
        }
    }
}
