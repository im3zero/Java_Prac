package array.ex;

import java.util.Scanner;

public class ArrayEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] numbers = new int[5];
        int sum = 0;
        System.out.println("5개의 정수를 입력하세요: ");
        for ( int n = 0; n < numbers.length ; n++){
            numbers[n] = scanner.nextInt();
            sum += numbers[n];


        }


        double average = sum/numbers.length;

        System.out.println("입력한 정수의 총합: " + sum);
        System.out.println("입력한 정수의 평균: " + average);


    }
}
