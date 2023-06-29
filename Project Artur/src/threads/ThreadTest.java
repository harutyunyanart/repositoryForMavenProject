package threads;

public class ThreadTest {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("t1");
        t1.start();
        MyThread t2 = new MyThread("t2");
        t2.start();
      Thread t3 = new Thread(new MyRunnable("t3"));
      t3.start();
    }
}
