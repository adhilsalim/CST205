import java.io.*;

class newThread extends Thread {
    synchronized public void run() {
        for (int i = 0; i <= 5; i++) {
            try {
                System.out.println(Thread.currentThread().getName() + " " + i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}

class SyncThread {
    public static void main(String[] args) {
        newThread t1 = new newThread();
        newThread t2 = new newThread();
        newThread t3 = new newThread();
        t1.start();
        t2.start();
        t3.start();
    }
}
