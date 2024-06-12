package EvenoddThread;

public class EvenOddThreads {
    public static void main(String[] args) {
        int limit = 10; 

        EvenThread evenThread = new EvenThread(limit);
        OddThread oddThread = new OddThread(limit);

        evenThread.start();
        try {
            evenThread.join(); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        oddThread.start();
        try {
            oddThread.join();  
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Both threads have finished execution.");
    }
}