package DesignPatterns.SinglePattern;

public class LazyPattern_Synchronized {
    private static LazyPattern_Synchronized instance;
    private LazyPattern_Synchronized(){};
    public static synchronized LazyPattern_Synchronized getInstance(){
        if (instance==null){
            instance=new LazyPattern_Synchronized();
        }
        return instance;
    }
}
