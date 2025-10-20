package array.ex;

import java.util.Scanner;

public class ProductAdminEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] productNames = new String[10];
        int [] productPrices = new int[10];

        int productCount = 0;

        int i = 0;
        while (true){
            System.out.print("1. 상품 등록 | 2. 상품 목록 | 3. 종료 \n메뉴를 선택하세요: ");
            int pick = scanner.nextInt();


            if (i >= 10){
                System.out.println("더 이상 상품을 등록할 수 없습니다.");
                continue;
            }

            if (pick == 1){
                System.out.println("상품 이름을 입력하세요: ");
                productNames[i] = scanner.next();
                System.out.println("상품 가격을 입력하세요: ");
                productPrices[i] = scanner.nextInt();
                i++;


            } else if(pick == 2){
                if (i == 0){
                    System.out.println("등록된 상품이 없습니다. ");
                }
                for (int n = 0; n < i; n++) {
                    System.out.println(productNames[n] + " : " + productPrices[n] + "원");
                }

            }  else if(pick == 3){
                break;
            } else{
                System.out.println("잘못된 메뉴를 선택하셨습니다.");
            }
        }

    }
}

