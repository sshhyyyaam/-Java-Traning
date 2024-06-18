package Excercise3;

public class ThreadGroupTest {
    public static void main(String[] args) {
        
        ThreadGroup group = new ThreadGroup("My Thread Group");

        
        MyThread thread1 = new MyThread(group, "Thread 1");
        MyThread thread2 = new MyThread(group, "Thread 2");
        thread1.start();
        thread2.start();

        
        displayThreadGroupInfo(group);

        
        thread1.setPriority(Thread.MIN_PRIORITY);
        thread2.setPriority(Thread.MAX_PRIORITY);
        System.out.println(thread1.getName() + " priority: " + thread1.getPriority());
        System.out.println(thread2.getName() + " priority: " + thread2.getPriority());
    }

    
    public static void displayThreadGroupInfo(ThreadGroup group) {
        int activeCount = group.activeCount();
        Thread[] threads = new Thread[activeCount];
        group.enumerate(threads);

        System.out.println("Thread Group: " + group.getName());
        for (Thread thread : threads) {
            System.out.println("Thread name: " + thread.getName() + ", isAlive: " + thread.isAlive());
        }
    }
}

class MyThread extends Thread {
    public MyThread(ThreadGroup group, String name) {
        super(group, name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(getName() + " - Count: " + i);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
