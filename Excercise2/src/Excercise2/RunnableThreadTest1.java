package Excercise2;

public class RunnableThreadTest1 {
    public static void main(String[] args) {
        // Creating an instance of PrintNameRunnable
        PrintNameRunnable printNameRunnable = new PrintNameRunnable();

        // Creating a Thread object and passing the Runnable instance
        Thread thread = new Thread(printNameRunnable);

        // Explicitly calling the start() method to start the thread
        thread.start();
    }
}

class PrintNameRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Count: " + i);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
