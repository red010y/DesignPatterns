package DesignPatterns.SinglePattern;

public class Test_LazyPattern {
    public static void main(String[] args) {
        LazyPattern lazy1 = LazyPattern.getInstance();
        LazyPattern lazy2 = LazyPattern.getInstance();
        lazy1.say("hi");
        if (lazy1==lazy2) System.out.println("we are one");
    }
}
