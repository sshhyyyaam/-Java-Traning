/*In this exercise, you are going to learn how to create and start a thread execution by writing a class that extends Thread class.  You will learn how to start the thread by either not having the start() method in the constructor of the subclass or having it in the constructor of the subclass. 
The start() method is NOT in the constructor of the subclass
The start() method is in the constructor of the subclass
*/

package Excercise1;

class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " - Count: " + i);
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start(); 

        MyThread t2 = new MyThread();
        t2.start(); 
    }
}
