public class NumPrint2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <=10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(500); // Sleep for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        // Create a new thread and start it
        NumPrint2 thread = new NumPrint2();
        thread.start();
    }
}