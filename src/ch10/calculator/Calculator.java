package src.ch10.calculator;

import src.ch10.calculator.Calc;

public abstract class Calculator implements Calc {

    @Override
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int substract(int num1, int num2) {
        return num1 - num2;
    }

//    @Override
//    public void description() {
//        System.out.println("Calculator에서 구현한 default method");
//    }
    @Override
    public void testMessage() {
        System.out.println("Calculator에서 구현한 testMessage()");
    }

}
