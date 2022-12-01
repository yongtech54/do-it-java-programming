package src.ch10.calculator;

public class CalculatorTest {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        CompleteCalc myCalc = new CompleteCalc();

        myCalc.showInfo();
        System.out.println(myCalc.add(num1, num2));
        System.out.println(myCalc.substract(num1, num2));
        System.out.println(myCalc.times(num1, num2));
        System.out.println(myCalc.divide(num1, num2));
        System.out.println(myCalc.square(num1));
        myCalc.description();
        myCalc.testMessage();
        Calc.staticMessage();
        System.out.println(Calc.PI);
    }
}
