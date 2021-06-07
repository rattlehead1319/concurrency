package thread.termination;

public class ThreadTermination1 {

    public static void main(String [] args) {
        Thread thread = new Thread(new BlockingTask());

        thread.start();
    }

    private static class BlockingTask implements Runnable {

        @Override
        public void run() {
            //do things
            try {
                Thread.sleep(500000);
            } catch (InterruptedException e) {
                System.out.println("Existing blocking thread");
            }
        }
    }
}
