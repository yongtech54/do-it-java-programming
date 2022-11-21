package src.ch03;

public class OperationEx3 {
    public static void main(String[] args) {
        int num = 10;
        int i = 2;

        boolean flag = ( ((num += 10) < 10) && ( (i += 2) < 10));   // 앞 조건에서 false, sce에 의해 다음 조건 수행 X
        System.out.println(flag);   // false
        System.out.println(num);    // 20
        System.out.println(i);      // 2 (not 4)

        boolean flag2 = (( (num += 10) > 10) || ( (i += 2 ) < 10));  // 앞 조건에서 true, sce에 의해 다음 조건 수행 X
        System.out.println(flag2);  // true
        System.out.println(num);    // 30
        System.out.println(i);      // 2 (not 4)
    }
}
