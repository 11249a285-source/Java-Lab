
class Counter {
    int left = 10000;

    void decrement() {
        left--;
    }
}

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();

        Runnable job = () -> {
            for (int i = 0; i < 1000; i++)
                c.decrement();
        };

        Thread t1 = new Thread(job);
        Thread t2 = new Thread(job);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Left = " + c.left);
    }
}
