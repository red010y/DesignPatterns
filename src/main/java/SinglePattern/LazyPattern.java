package DesignPatterns.SinglePattern;

public class LazyPattern {
    private static LazyPattern instance;
    //确保外部类无法直接创建对象，只能通过下面的getInstqance方法进行创建
    private LazyPattern (){}
    //因为单例对象只能通过自己进行创建，外部是不能通过new对象调用方法的方式的，所有方法必须是static
    public static LazyPattern getInstance(){
        //如果有了实例了，就不需要要创建了
        if (instance==null) {
            instance=new LazyPattern();
        }
        return instance;
    }
    public void say(String s){
        System.out.println(s);
    }
}
