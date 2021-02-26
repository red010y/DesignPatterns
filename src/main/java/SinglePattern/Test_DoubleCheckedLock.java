package DesignPatterns.SinglePattern;

public class Test_DoubleCheckedLock {
    public static void main(String[] args) {
        DoubleCheckedLock instance1 = DoubleCheckedLock.getInstance();
        DoubleCheckedLock instance2 = DoubleCheckedLock.getInstance();
        if (instance1==instance2) System.out.println("we are one");
    }
}
