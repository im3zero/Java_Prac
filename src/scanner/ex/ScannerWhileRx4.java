package scanner.ex;

import java.util.Scanner;

public class ScannerWhileRx4 {
    public static void main(String[] args) {
        int option = 0;
        int price = 0;
        int total = 0;
        int num = 0;
        Scanner scanner = new Scanner(System.in);


        while(true){
            System.out.println("1: 상품 입력, 2: 결제, 3: 프로그램 종료");
            option = scanner.nextInt();
            if (option == 1){
                scanner.nextLine();//이전에 입력한 문자열 제거

                System.out.println("상품명을 입력하세요: ");
                String name = scanner.nextLine();

                System.out.println("상품의 가격을 입력하세요: ");
                price = scanner.nextInt();

                System.out.println("구매수량을 입력하세요: ");
                num = scanner.nextInt();

                total = num * price;

                System.out.println("상품명: "+name+" 가격: "+price+" 수량: "+num+" 합게: "+total);

            } else if (option == 2){
                total = num * price;
                System.out.println("총 비용: "+ total);
            } else if (option == 3){
                System.out.println("프로그램을 종료합니다. ");
                break;
            }
        }


    }
}
