package DesignPatterns.StrategyPattern;

public class StrategyDemo {


    public static void main(String[] args) {
        Context context = new Context(new Add());
        System.out.println("10 + 10 =" + context.executeStrategy(10,10));

        Context context1 = new Context(new Multiply());
        System.out.println("10 * 10 =" + context1.executeStrategy(10,10));


        Context context2 = new Context(new Subtract());
        System.out.println("10 - 10 =" + context2.executeStrategy(10,10));


    }
}