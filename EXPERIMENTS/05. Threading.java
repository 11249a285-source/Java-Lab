PROGRAM 5.1 — ThreadDemo.java
  
 class First extends Thread {
     public void run() {
         for (int i = 1; i <= 3; i++)
             System.out.println("Thread A : " + i);
     }
 }
 class Second implements Runnable {
     public void run() {
         for (int i = 1; i <= 3; i++)
             System.out.println("Thread B : " + i);
     }
 }
 public class ThreadDemo {
     public static void main(String[] args) {
         First a = new First();
         Thread b = new Thread(new Second());
         a.start();
         b.start();
     }

 }

PROGRAM 5.2 — SyncDemo.java
  
 class Counter {
     private int count = 0;
     synchronized void increment() { count++; }
     int get() { return count; }
 }
 public class SyncDemo {
     public static void main(String[] args) throws InterruptedException {
         Counter c = new Counter();
         Runnable job = () -> {
             for (int i = 0; i < 10000; i++)
                 c.increment();
         };
         Thread t1 = new Thread(job);
         Thread t2 = new Thread(job);
         t1.start(); t2.start();
         t1.join();   t2.join();
         System.out.println("Final count = " + c.get());
     }
 }
