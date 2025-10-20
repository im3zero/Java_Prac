package operator;

public class OperatorAdd2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;


        b = ++a; // a의 값을 먼저 증가시키고, 그 후에 b에 대입 => a, b값 둘다 증가함
        System.out.println("a = " + a + ", b = " + b);


        //후위증감연산자
        a = 1;
        b = 0; //값을 다시 지정

        b = a ++; //a의 현재 값을 b에 먼저 대입하고, 그 후 a 값을 증가시킴
        System.out.println("a = " + a + ", b = " + b);


        //둘 다 같은 결과
        ++a;
        System.out.println("a = " + a);
        a++;
        System.out.println("a = " + a);
    }
}
