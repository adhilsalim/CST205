class Counter {
    public static int count = 0;

    public static void increment() {
        count++;
    }
}

class NoSyncThread implements Runnable {
    public void run() {
        for (int i = 0; i < 500; i++) {
            Counter.increment();
        }
    }
}

class SyncThread implements Runnable {
    public void run() {
        for (int i = 0; i < 500; i++) {
            Counter.increment();
        }
    }
}

public class ThreadCounter {
    public static void main(String[] args) {
        NoSyncThread nst = new NoSyncThread();
        SyncThread st = new SyncThread();

        Thread t1 = new Thread(nst, "one");
        Thread t2 = new Thread(nst, "two");
        Thread t3 = new Thread(st, "three");
        Thread t4 = new Thread(st, "four");

        t1.start();
        t2.start();
        System.out.println("sum without sync: " + Counter.count);

        Counter.count = 0;

        t3.start();
        t4.start();
        System.out.println("sum with sync: " + Counter.count);
    }
}