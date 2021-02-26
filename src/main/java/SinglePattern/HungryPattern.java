package DesignPatterns.SinglePattern;

public class HungryPattern {
    private static final HungryPattern instance=new HungryPattern();
    private HungryPattern(){}
    public static HungryPattern getInstance(){
        return instance;
    }
    public void say(String s){
        System.out.println(s);
    }
}
