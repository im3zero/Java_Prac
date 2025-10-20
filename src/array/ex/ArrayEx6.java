package array.ex;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = 0, max = 0;


        System.out.print("입력바을 숫자의 개수를 입력하세요: ");
        int n = scanner.nextInt();

        int numbers[] = new int[n];
        System.out.println( n + "개의 정수를 입력하세요: ");
        for ( int k = 0; k < n; k++) {
            numbers[k] = scanner.nextInt();

        }

        int i = 0;
        while ( i < numbers.length){
            min = numbers[0];
            max = numbers[0];
            if (numbers[i] < min){
                min = numbers[i];
            }
            if (numbers[i] > max){
                max = numbers[i];
            }
            i++;
        }


        System.out.println("가장 작은 정수: " + min);
        System.out.println("가장 큰 정수: " + max);
    }
}
