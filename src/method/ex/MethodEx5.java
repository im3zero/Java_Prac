package method.ex;

import java.util.Scanner;

public class MethodEx5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 0;


        while (true) {
            System.out.println("\n---------------------------------\n" + "1.입금 | 2.출금 | 3.잔액 확인 | 4.종료\n" + "---------------------------------");
            System.out.print("선택: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    //입금 메뉴
                    System.out.print("입금액을 입력하세요: ");
                    int input = sc.nextInt();
                    balance = deposit(balance, input);
                    System.out.println("현재 잔액: " + balance);
                    break;


                case 2:
                    // 출금 메뉴
                    System.out.print("출금액을 입력하세요: ");
                    int output = sc.nextInt();
                    //withdraw(balance, output);
                    balance = withdraw(balance, output);
                    System.out.print("현재 잔액: " + balance);
                    break;

                case 3:
                    // 잔액 확인
                    System.out.print("현재 잔액: " + balance);
                    break;

                case 4:
                    return;

                default:
                    //1, 2, 3, 4 외의 다른 번호 선택
                    System.out.println("올바른 선택이 아닙니다. 다시 선택해주세요.");

            }
        }


    }

    public static int deposit(int balance, int amount) {
        System.out.print(amount + "원을 입급하셨습니다.");
        balance += amount;
        return balance;
    }

    public static int withdraw(int balance, int amount) {
        if (balance >= amount) {
            System.out.print(amount + "원을 출금하셨습니다.");
            balance -= amount;
        } else {
            System.out.println(amount + "원을 출금하려 했으나 잔액이 부족합니다. ");
        }
        return balance;
    }

}
