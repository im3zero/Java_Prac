package cond;

public class If6 {
    public static void main(String[] args) {
        int price = 10000;
        int age = 10;
        int discount = 0;

        if (price >= 10000){
            discount = discount +  1000;
        } else if (age <= 10) {
            discount = discount +  1000;
        } else {
            System.out.println("할인 없음");
        }

        System.out.println("총 할인 금액 : "+ discount);

        if (true) System.out.println("if 문에서 실행됨");
        //실행하는 문장이 하나일때는 중괄호를 안써도 됨

    }
}
