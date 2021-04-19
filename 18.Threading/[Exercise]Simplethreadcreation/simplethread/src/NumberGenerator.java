public class NumberGenerator implements Runnable {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println("10 số tự nhiên đầu tiên.");
        }
    }
}
