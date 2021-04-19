public class OddThread extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                if (i % 2 != 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
            Thread.sleep(10);
        } catch (InterruptedException e) {
            System.out.println("Dãy số lẻ.");
        }
    }
}
