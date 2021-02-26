package DesignPatterns.SinglePattern;

public class Test_HungryPattern {
    public static void main(String[] args) {
        HungryPattern instance1=HungryPattern.getInstance();
        HungryPattern instance2=HungryPattern.getInstance();
        if (instance1==instance2) System.out.println("we are one ");
        instance1.say("haa");
    }
}
