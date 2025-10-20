package cond;

public class If5 {
    public static void main(String[] args) {
        int price = 20000;
        int age = 9;
        int discount = 0;
        if (price >= 10000){
            price = price -1000;
            discount = discount + 1000;
        }
        if (age <= 10){
            price = price - 1000;
            discount = discount + 1000;
        }

        System.out.println("제품의 가격은 : "+ price);
        System.out.println("제품의 할인된 가격은 : "+ discount);
    }
}
