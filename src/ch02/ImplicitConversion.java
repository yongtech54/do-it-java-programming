package src.ch02;

public class ImplicitConversion {
    public static void main(String[] args) {
        byte bNum = 10;
        int iNum = bNum;

        System.out.println(bNum);
        System.out.println(iNum);

        iNum = 20;
        float fNum = iNum;
        double dNum = fNum + iNum;

        System.out.println(fNum);
        System.out.println(dNum);

        float pi1 = iNum;   // 20.0
        double pi2 = 3.14 + pi1;

        System.out.println(pi1);
        System.out.println(pi2);
    }
}
