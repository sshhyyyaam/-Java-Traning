package EvenoddThread;

class OddThread extends Thread {
    private int limit;

    public OddThread(int limit) {
        this.limit = limit;
    }

    public void run() {
        for (int i = 1; i <= limit; i += 2) {
            System.out.println("Odd: " + i);
            try {
                Thread.sleep(100); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
