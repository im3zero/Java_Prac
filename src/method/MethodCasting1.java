package method;

public class MethodCasting1 {
    public static void main(String[] args) {
        double number = 1.5;

        printNumber((int)number);
        //형변환 -> int 타입으로 변형해서 1이 됨
        //명시적 형변환 -> double 을 int 로 변환
    }

    public static void printNumber(int n){
        System.out.println("숫자: " + n);
    }
}
