class myThread implements Runnable {
    synchronized public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + " is running");
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class SyncThread {
    public static void main(String[] args) throws Exception {
        myThread mt = new myThread();

        // to create multiple thread
        Thread t1 = new Thread(mt, "Thread 0");
        Thread t2 = new Thread(mt, "Thread 1");
        Thread t3 = new Thread(mt, "Thread 2");

        t1.start();
        t2.start();
        t3.start();
    }
}
