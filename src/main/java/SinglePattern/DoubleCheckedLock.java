package DesignPatterns.SinglePattern;

public class DoubleCheckedLock {
    private volatile static DoubleCheckedLock instance;
    private DoubleCheckedLock(){}
    public static DoubleCheckedLock getInstance(){
        //提高效率，存在实例直接返回
        if (instance==null){
            synchronized (DoubleCheckedLock.class){
                //防止重复创建实例
                if (instance==null) {
                    instance = new DoubleCheckedLock();
                }
            }
        }
        return instance;
    }
}
