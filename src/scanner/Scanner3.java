package scanner;

import java.util.Scanner;

public class Scanner3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫 번쨰 숫자를 입력하세요: ");
        int num1 = scanner.nextInt();
        System.out.print("두 번쨰 숫자를 입력하세요: ");
        int num2 = scanner.nextInt();

        int big = 0;
        if (num1 > num2){
            big = num1;
        } else if( num1<num2){
            big = num2;
        } else num1 = num2;

        System.out.println("더 큰 수는: " + big);




    }
}

