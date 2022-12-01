package src.ch10.calculator;

import src.ch10.calculator.Calculator;

public class CompleteCalc extends Calculator {
    @Override
    public int times(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int divide(int num1, int num2) {
        if (num2 != 0) {
            return num1 / num2;
        }
        return ERROR;
    }

    @Override
    public int square(int num) {
        return num * num;
    }

    public void showInfo() {
        System.out.println("Calc 인터페이스를 모두 구현하였습니다.");
    }

    @Override
    public void description() {
        super.description();
        System.out.println("CompleteCalc에서 구현한 default method");
    }

    @Override
    public void testMessage() {
        super.testMessage();
        System.out.println("CompleteCalc에서 구현한 testMessage()");
    }
}
