package src.ch02;

public class ExplicitConversion {
    public static void main(String[] args) {
        double dNum = 1.2;
        float fNum = 0.9F;

        int res1 = (int) dNum + (int) fNum;
        int res2 = (int) (dNum + fNum);

        System.out.println(res1);
        System.out.println(res2);
    }
}
