package operator;

public class Operator2 {
    public static void main(String[] args) {
        //문자열과 문자열 더하기1
        String result1 = "hello" + "world";
        System.out.println(result1);

        //문자열과 문자열 더하기2
        String s1 = "hello";
        String s2 = "world";
        System.out.println(s1 + s2);

        String result3 = "a + b = " + 10;
        System.out.println(result3);

        int num = 20;
        String str = "a + b = ";
        String result4 = "a + b = " + num;
        System.out.println(result4);

    }
}
