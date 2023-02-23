class Counter {
    int count;

    public void increment() {
        count++;
    }
}

public class ThreadCounter {
    public static void main(String[] args) {
        Counter c = new Counter();

        Thread t1 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 500; i++) {
                    c.increment();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 500; i++) {
                    c.increment();
                }
            }
        });

        t1.start();
        t2.start();

        System.out.println("Count Value: " + c.count);

    }
}