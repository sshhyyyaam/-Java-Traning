package EvenoddThread;

class EvenThread extends Thread {
    private int limit;

    public EvenThread(int limit) {
        this.limit = limit;
    }

    public void run() {
        for (int i = 0; i <= limit; i += 2) {
            System.out.println("Even: " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}