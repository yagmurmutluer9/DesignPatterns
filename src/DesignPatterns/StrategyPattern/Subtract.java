package DesignPatterns.StrategyPattern;

public class Subtract implements StrategyInterface {

    @Override
    public int doOperation(int num1 , int num2) {

        return num1 - num2;
    }


}