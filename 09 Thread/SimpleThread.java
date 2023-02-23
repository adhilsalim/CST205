class ThreadExample extends Thread {
    synchronized public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(currentThread().getName());
        }
    }
}

public class SimpleThread {
    public static void main(String[] args) {
        ThreadExample threadOne = new ThreadExample();
        ThreadExample threadTwo = new ThreadExample();
        ThreadExample threadThree = new ThreadExample();

        threadOne.start();
        threadTwo.start();
        threadThree.start();
    }
}