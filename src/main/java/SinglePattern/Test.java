package DesignPatterns.SinglePattern;

public class Test {
    public static void main(String[] args) {
        Demo runnable = new Demo();
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        t1.start();
        t2.start();

    }
}
