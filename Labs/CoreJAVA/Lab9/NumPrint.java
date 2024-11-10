public class NumPrint extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        // Create a new thread and start it
        NumPrint thread = new NumPrint();
        thread.start();
    }
}
