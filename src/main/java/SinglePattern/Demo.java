package DesignPatterns.SinglePattern;

public class Demo implements Runnable{
    DoubleCheckedLock instance;
    @Override
    public void run() {
        instance = DoubleCheckedLock.getInstance();
        //打印地址值的hash值就知道是否指向同一个内存地址，也就是说是否是同一个对象
        System.out.println(instance.hashCode());
    }
}
