package method;

public class MethodCasting2 {
    public static void main(String[] args) {
        int number = 100;
        printNumber(number);

    }

    public static void printNumber(double n){
        System.out.println("숫자: " + n);
        //더블 -> 인트
        //아무 문제 없음!!

    }
}
