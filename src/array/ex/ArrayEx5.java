package array.ex;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.print("입력받을 숫자의 개수를 입력하세요: ");
        int n = scanner.nextInt();

        System.out.println( n + "개의 정수를 입력하세요: ");
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++){
                int k = scanner.nextInt();
                numbers[i] = k;
                //numbers[i] = scanner.nextInt();
                sum = sum + k;
                //sum +=numbers;
        }


        double average = 0;
        average = sum/n;


        System.out.println("입력한 정수의 합계: " + sum);
        System.out.println("입력한 정수의 평균: " + average);






    }
}
