package cond.ex;

public class OddEvenEX {
    public static void main(String[] args) {
        int x = 3;

        String even = (x % 2 == 0) ? "짝수" : "홀수";

        System.out.println("x = " + x + "," + even);


    }
}
