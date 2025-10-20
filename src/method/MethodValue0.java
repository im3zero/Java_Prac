package method;

public class MethodValue0 {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = num1;
        //num1을  num2에 대입하기 전에 num1값을 읽는다.
        //값을 복사해서 대입한다는 부분
        //num1을 읽어도 num1의 값은 유지됨
        //num1값의 변수 자체가 들어간게 아니라 복사되어서 들어간 것임
        num2 = 10;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);



    }

}
