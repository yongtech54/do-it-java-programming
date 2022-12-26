package src.ch13.lambda;
@FunctionalInterface
interface PrintString {
    public abstract void showString(String str);
}


public class StringLambda {
    public static void main(String[] args) {
        PrintString lambdaStr = s -> System.out.println(s);
        lambdaStr.showString("Hello lambda 1");

        showMyString(lambdaStr);

        PrintString reStr = returnString();
        reStr.showString("Java");
    }

    public static void showMyString(PrintString p) {
        p.showString("Hello lambda 2");
    }

    public static PrintString returnString() {
        return s -> System.out.println(s + "!!");
    }
}
